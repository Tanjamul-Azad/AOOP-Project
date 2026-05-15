package com.cse.project.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "skill_circles")
public class SkillCircle {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "icon")
    private String icon;

    @Column(name = "member_count", nullable = false)
    private Integer memberCount;

    @Column(name = "last_session")
    private LocalDateTime lastSession;

    @Column(name = "activity", nullable = false)
    private String activity;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public SkillCircle() {
    }
}
