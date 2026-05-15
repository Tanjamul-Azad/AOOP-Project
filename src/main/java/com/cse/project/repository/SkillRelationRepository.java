package com.cse.project.repository;

import com.cse.project.entity.SkillRelation;
import com.cse.project.entity.SkillRelationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRelationRepository extends JpaRepository<SkillRelation, SkillRelationId> {
}
