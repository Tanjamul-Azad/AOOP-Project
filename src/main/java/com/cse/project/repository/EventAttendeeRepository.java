package com.cse.project.repository;

import com.cse.project.entity.EventAttendee;
import com.cse.project.entity.EventAttendeeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventAttendeeRepository extends JpaRepository<EventAttendee, EventAttendeeId> {
}
