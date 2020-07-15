package com.example.demo.controllers.dao;

import com.example.demo.controllers.domain.Measurement;
import com.example.demo.controllers.domain.Temperature;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryMeasurementRepository implements MeasurementRepository {
    private List<Measurement> measurements = new ArrayList<>();

    @Override
    public List<Measurement> getAll() {
        return measurements;
    }

    @Override
    public void save(Temperature temperature) {
        var measurement = Measurement.now(temperature);

        measurements.add(measurement);
    }
}
