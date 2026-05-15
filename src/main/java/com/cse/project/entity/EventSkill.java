package com.cse.project.entity;

import jakarta.persistence.*;

@Entity(name = "event_skills")
@IdClass(EventSkillId.class)
public class EventSkill {

    @Id
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    public EventSkill() {
    }
}
