package com.cse.project.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "skill_relations")
@IdClass(SkillRelationId.class)
public class SkillRelation {

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Id
    @ManyToOne
    @JoinColumn(name = "related_skill_id")
    private Skill relatedSkill;

    @Column(name = "similarity_score", nullable = false)
    private BigDecimal similarityScore;

    public SkillRelation() {
    }
}
