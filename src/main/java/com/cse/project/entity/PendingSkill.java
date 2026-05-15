package com.cse.project.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "pending_skills")
public class PendingSkill {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "normalized_name", nullable = false)
    private String normalizedName;

    @Column(name = "display_name", nullable = false)
    private String displayName;

    @Column(name = "category")
    private String category;

    @Column(name = "description")
    private String description;

    @Column(name = "source_intent", columnDefinition = "TEXT")
    private String sourceIntent;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "seen_count", nullable = false)
    private Integer seenCount;

    @Column(name = "confidence_sum", nullable = false)
    private Double confidenceSum;

    @Column(name = "first_seen_at")
    private LocalDateTime firstSeenAt;

    @Column(name = "last_seen_at")
    private LocalDateTime lastSeenAt;

    @ManyToOne
    @JoinColumn(name = "requested_by_user_id")
    private User requestedByUser;

    @ManyToOne
    @JoinColumn(name = "promoted_skill_id")
    private Skill promotedSkill;

    @ManyToOne
    @JoinColumn(name = "reviewed_by_user_id")
    private User reviewedByUser;

    @Column(name = "review_note")
    private String reviewNote;

    @Column(name = "reviewed_at")
    private LocalDateTime reviewedAt;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public PendingSkill() {
    }
}
