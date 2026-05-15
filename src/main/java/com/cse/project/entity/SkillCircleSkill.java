package com.cse.project.entity;

import jakarta.persistence.*;

@Entity(name = "skill_circle_skills")
@IdClass(SkillCircleSkillId.class)
public class SkillCircleSkill {

    @Id
    @ManyToOne
    @JoinColumn(name = "circle_id")
    private SkillCircle circle;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    public SkillCircleSkill() {
    }
}
