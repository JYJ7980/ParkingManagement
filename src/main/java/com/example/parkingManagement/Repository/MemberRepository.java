package com.example.parkingManagement.Repository;

import com.example.parkingManagement.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
