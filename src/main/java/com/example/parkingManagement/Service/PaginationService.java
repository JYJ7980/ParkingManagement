package com.example.parkingManagement.Service;

import com.example.parkingManagement.Entity.ParkingRecord;
import com.example.parkingManagement.Repository.ParkingRecordRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class PaginationService {
    private final ParkingRecordRepository parkingRecordRepository;
    private static final int BAR_LENGTH=5;

    public PaginationService(ParkingRecordRepository parkingRecordRepository) {
        this.parkingRecordRepository = parkingRecordRepository;
    }

    public List<Integer> getPaginationBarNumbers(int currentPageNumber, int totalPages) {
        int startNumber = Math.max(currentPageNumber - (BAR_LENGTH / 2), 0);
        int endNumber = Math.min(startNumber + BAR_LENGTH, totalPages);
        return IntStream.range(startNumber, endNumber).boxed().toList();
    }

    public Page<ParkingRecord> pagingList(Pageable pageable) {
        return parkingRecordRepository.findAll(pageable);
    }

}
