package com.cse.project.controller;

import com.cse.project.entity.EventAttendee;
import com.cse.project.entity.EventAttendeeId;
import com.cse.project.repository.EventAttendeeRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/event-attendees")
public class EventAttendeeController extends AbstractCrudController<EventAttendee, EventAttendeeId> {

    public EventAttendeeController(EventAttendeeRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected EventAttendeeId parseId(String id) {
        return ControllerIds.eventAttendeeId(id);
    }
}
