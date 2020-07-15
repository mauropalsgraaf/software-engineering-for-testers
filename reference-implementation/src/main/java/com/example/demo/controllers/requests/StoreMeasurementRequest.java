package com.example.demo.controllers.requests;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class StoreMeasurementRequest {
    @Min(-50)
    @Max(50)
    public Integer temperature;
}
