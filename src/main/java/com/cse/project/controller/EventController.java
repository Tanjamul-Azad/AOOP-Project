package com.cse.project.controller;

import com.cse.project.entity.Event;
import com.cse.project.repository.EventRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/events")
public class EventController extends AbstractCrudController<Event, String> {

    public EventController(EventRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
