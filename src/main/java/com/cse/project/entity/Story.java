package com.cse.project.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "stories")
public class Story {

    @Id
    @Column(name = "id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "is_seen", nullable = false)
    private Boolean isSeen;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public Story() {
    }
}
