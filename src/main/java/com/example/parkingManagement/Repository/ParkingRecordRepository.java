package com.example.parkingManagement.Repository;

import com.example.parkingManagement.Entity.ParkingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingRecordRepository extends JpaRepository<ParkingRecord, Long> {
}
