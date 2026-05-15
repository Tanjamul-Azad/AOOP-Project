package com.cse.project.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "users")
public class User {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "avatar_url", columnDefinition = "TEXT")
    private String avatarUrl;

    @Column(name = "university")
    private String university;

    @Column(name = "location")
    private String location;

    @Column(name = "bio", columnDefinition = "TEXT")
    private String bio;

    @Column(name = "teach_intent_text", columnDefinition = "TEXT")
    private String teachIntentText;

    @Column(name = "learn_intent_text", columnDefinition = "TEXT")
    private String learnIntentText;

    @Column(name = "skillex_score", nullable = false)
    private Integer skillexScore;

    @Column(name = "level", nullable = false)
    private String level;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "sessions_completed", nullable = false)
    private Integer sessionsCompleted;

    @Column(name = "rating")
    private BigDecimal rating;

    @Column(name = "is_online", nullable = false)
    private Boolean isOnline;

    @Column(name = "connections_public", nullable = false)
    private Boolean connectionsPublic;

    @Column(name = "joined_at")
    private LocalDateTime joinedAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public User() {
    }
}
