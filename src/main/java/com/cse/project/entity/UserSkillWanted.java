package com.cse.project.entity;

import jakarta.persistence.*;

@Entity(name = "user_skills_wanted")
@IdClass(UserSkillWantedId.class)
public class UserSkillWanted {

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Column(name = "level", nullable = false)
    private String level;

    public UserSkillWanted() {
    }
}
