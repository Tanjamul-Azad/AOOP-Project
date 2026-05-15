package com.cse.project.repository;

import com.cse.project.entity.SkillCreditLedger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillCreditLedgerRepository extends JpaRepository<SkillCreditLedger, String> {
}
