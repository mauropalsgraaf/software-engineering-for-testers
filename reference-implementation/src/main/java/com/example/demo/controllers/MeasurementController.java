package com.example.demo.controllers;

import com.example.demo.controllers.dao.MeasurementRepository;
import com.example.demo.controllers.domain.Temperature;
import com.example.demo.controllers.requests.StoreMeasurementRequest;
import com.example.demo.controllers.responses.GetMeasurementsResponse;
import com.example.demo.controllers.responses.MeasurementDTO;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.stream.Collectors;

@RestController
public class MeasurementController {

    private final MeasurementRepository measurementRepository;

    public MeasurementController(MeasurementRepository measurementRepository) {
        this.measurementRepository = measurementRepository;
    }

    @GetMapping("/measurement")
    public GetMeasurementsResponse getMeasurements() {
        var measurements = measurementRepository.getAll();

        var measurementDTOs = measurements
                .stream()
                .map(measurement -> new MeasurementDTO(measurement.getTimestamp(), measurement.getTemperature().getTemperature()))
                .collect(Collectors.toList());

        return new GetMeasurementsResponse(measurementDTOs);
    }

    @PutMapping("/measurement")
    public void storeMeasurement(@Valid @RequestBody StoreMeasurementRequest request) {
        var temperature = new Temperature(request.temperature);

        measurementRepository.save(temperature);
    }
}
