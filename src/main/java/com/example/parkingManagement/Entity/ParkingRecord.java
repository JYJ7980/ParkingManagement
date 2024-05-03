package com.example.parkingManagement.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class ParkingRecord {
    @Id
    @Column(name = "register_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registerId;
    @Column(name = "car_number")
    private String carNumber;
    private LocalDateTime intime;
    private LocalDateTime outtime;
}
