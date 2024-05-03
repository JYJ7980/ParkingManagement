package com.example.parkingManagement.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
public class Member {
    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;
    private String name;
    private String phone;
    @Column(name = "car_number")
    private String carNumber;
    @Column(name = "membership_num")
    private String membershipNum;
    @Column(name = "membership_start", updatable = false)
    @CreatedDate
    private LocalDateTime membershipStart;
    @Column(name = "membership_end", insertable = false)
    @LastModifiedDate
    private LocalDateTime membershipEnd;
}
