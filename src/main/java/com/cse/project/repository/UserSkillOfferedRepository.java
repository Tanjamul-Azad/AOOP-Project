package com.cse.project.repository;

import com.cse.project.entity.UserSkillOffered;
import com.cse.project.entity.UserSkillOfferedId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSkillOfferedRepository extends JpaRepository<UserSkillOffered, UserSkillOfferedId> {
}
