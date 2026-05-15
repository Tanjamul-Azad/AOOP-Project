package com.cse.project.repository;

import com.cse.project.entity.SkillCreditWallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillCreditWalletRepository extends JpaRepository<SkillCreditWallet, String> {
}
