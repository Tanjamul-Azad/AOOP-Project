package com.cse.project.repository;

import com.cse.project.entity.SkillCircle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillCircleRepository extends JpaRepository<SkillCircle, String> {
}
