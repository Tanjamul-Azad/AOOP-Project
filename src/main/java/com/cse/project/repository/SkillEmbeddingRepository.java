package com.cse.project.repository;

import com.cse.project.entity.SkillEmbedding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillEmbeddingRepository extends JpaRepository<SkillEmbedding, String> {
}
