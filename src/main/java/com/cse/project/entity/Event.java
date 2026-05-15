package com.cse.project.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "events")
public class Event {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "host_id", nullable = false)
    private User host;

    @Column(name = "event_date", nullable = false)
    private LocalDateTime eventDate;

    @Column(name = "location")
    private String location;

    @Column(name = "is_online", nullable = false)
    private Boolean isOnline;

    @Column(name = "cover_gradient")
    private String coverGradient;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public Event() {
    }
}
