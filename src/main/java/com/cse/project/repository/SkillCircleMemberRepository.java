package com.cse.project.repository;

import com.cse.project.entity.SkillCircleMember;
import com.cse.project.entity.SkillCircleMemberId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillCircleMemberRepository extends JpaRepository<SkillCircleMember, SkillCircleMemberId> {
}
