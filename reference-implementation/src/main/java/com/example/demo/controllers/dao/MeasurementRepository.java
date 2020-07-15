package com.example.demo.controllers.dao;

import com.example.demo.controllers.domain.Measurement;
import com.example.demo.controllers.domain.Temperature;

import java.util.List;

public interface MeasurementRepository {
    List<Measurement> getAll();
    void save(Temperature temperature);
}
