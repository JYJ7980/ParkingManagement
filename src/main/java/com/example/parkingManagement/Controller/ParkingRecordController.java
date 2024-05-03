package com.example.parkingManagement.Controller;

import com.example.parkingManagement.Service.PaginationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.print.Pageable;
import java.util.List;

@Controller
public class ParkingRecordController {
    @Autowired
    PaginationService paginationService;

    @GetMapping("/record")
    public String parkingRecord(@PageableDefault(page = 0, size = 10)Pageable pageable){
        int totalPage = paging.getTotalPages();
        List<Integer> barNumbers=paginationService.getPaginationBarNumbers(pageable.getPageNumber(),totalPage);
        model.addAttribute("paginationBarNumbers", barNumbers);
        return "/parkingRecord";
    }
}
