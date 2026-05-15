package com.cse.project.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "discussions")
public class Discussion {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private User author;

    @Column(name = "category")
    private String category;

    @Column(name = "upvotes", nullable = false)
    private Integer upvotes;

    @Column(name = "replies", nullable = false)
    private Integer replies;

    @Column(name = "views", nullable = false)
    private Integer views;

    @Column(name = "is_pinned", nullable = false)
    private Boolean isPinned;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public Discussion() {
    }
}
