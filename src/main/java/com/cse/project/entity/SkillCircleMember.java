package com.cse.project.entity;

import jakarta.persistence.*;

@Entity(name = "skill_circle_members")
@IdClass(SkillCircleMemberId.class)
public class SkillCircleMember {

    @Id
    @ManyToOne
    @JoinColumn(name = "circle_id")
    private SkillCircle circle;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public SkillCircleMember() {
    }
}
