package com.example.parkingManagement.Dto;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class ParkingRecordDto {
    private Long registerId;
    private String carNumber;
    private LocalDateTime intime;
    private LocalDateTime outtime;
}
