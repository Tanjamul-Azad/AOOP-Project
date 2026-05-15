package com.cse.project.repository;

import com.cse.project.entity.PendingSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PendingSkillRepository extends JpaRepository<PendingSkill, String> {
}
