package com.cse.project.repository;

import com.cse.project.entity.SkillCircleSkill;
import com.cse.project.entity.SkillCircleSkillId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillCircleSkillRepository extends JpaRepository<SkillCircleSkill, SkillCircleSkillId> {
}
