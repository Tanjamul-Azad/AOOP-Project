package com.cse.project.repository;

import com.cse.project.entity.UserSkillWanted;
import com.cse.project.entity.UserSkillWantedId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSkillWantedRepository extends JpaRepository<UserSkillWanted, UserSkillWantedId> {
}
