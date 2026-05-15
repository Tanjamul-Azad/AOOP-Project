package com.cse.project.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "skill_catalog_audit")
public class SkillCatalogAudit {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "action", nullable = false)
    private String action;

    @ManyToOne
    @JoinColumn(name = "pending_skill_id")
    private PendingSkill pendingSkill;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @ManyToOne
    @JoinColumn(name = "actor_user_id")
    private User actorUser;

    @Column(name = "details")
    private String details;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public SkillCatalogAudit() {
    }
}
