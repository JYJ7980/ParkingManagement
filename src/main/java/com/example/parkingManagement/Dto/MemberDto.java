package com.example.parkingManagement.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
public class MemberDto {
    private Long memberId;
    private String name;
    private String phone;
    private String carNumber;
    private String membershipNum;
    private LocalDateTime membershipStart;
    private LocalDateTime membershipEnd;
}
