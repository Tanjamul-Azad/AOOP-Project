package com.cse.project.entity;

import jakarta.persistence.*;

@Entity(name = "event_attendees")
@IdClass(EventAttendeeId.class)
public class EventAttendee {

    @Id
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public EventAttendee() {
    }
}
