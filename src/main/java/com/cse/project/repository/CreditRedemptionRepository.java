package com.cse.project.repository;

import com.cse.project.entity.CreditRedemption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRedemptionRepository extends JpaRepository<CreditRedemption, String> {
}
