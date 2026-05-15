package com.cse.project.repository;

import com.cse.project.entity.EventSkill;
import com.cse.project.entity.EventSkillId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventSkillRepository extends JpaRepository<EventSkill, EventSkillId> {
}
