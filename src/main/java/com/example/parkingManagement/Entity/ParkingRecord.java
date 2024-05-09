package com.example.parkingManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
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
