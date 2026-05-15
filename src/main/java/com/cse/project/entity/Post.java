package com.cse.project.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "posts")
public class Post {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "type", nullable = false)
    private String type;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private User author;

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Column(name = "badge")
    private String badge;

    @Column(name = "likes", nullable = false)
    private Integer likes;

    @Column(name = "comments", nullable = false)
    private Integer comments;

    @Column(name = "shares", nullable = false)
    private Integer shares;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public Post() {
    }
}
