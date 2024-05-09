package com.example.parkingManagement.Controller;

import com.example.parkingManagement.Entity.ParkingRecord;
import com.example.parkingManagement.Service.PaginationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class ParkingRecordController {
    @Autowired
    PaginationService paginationService;

    @GetMapping("/record")
    public String parkingRecord(Model model,
                                @PageableDefault(page = 0, size = 10, sort = "registerId", direction = Sort.Direction.ASC)Pageable pageable){
        Page<ParkingRecord> paging = paginationService.pagingList(pageable);
        int totalPage = paging.getTotalPages();
        List<Integer> barNumbers=paginationService.getPaginationBarNumbers(pageable.getPageNumber(),totalPage);
        model.addAttribute("paginationBarNumbers", barNumbers);
        model.addAttribute("paging", paging);
        return "/parkingRecord";
    }
}
