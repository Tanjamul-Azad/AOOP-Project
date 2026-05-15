package com.cse.project.repository;

import com.cse.project.entity.SkillCatalogAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillCatalogAuditRepository extends JpaRepository<SkillCatalogAudit, String> {
}
