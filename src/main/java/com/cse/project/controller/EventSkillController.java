package com.cse.project.controller;

import com.cse.project.entity.EventSkill;
import com.cse.project.entity.EventSkillId;
import com.cse.project.repository.EventSkillRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/event-skills")
public class EventSkillController extends AbstractCrudController<EventSkill, EventSkillId> {

    public EventSkillController(EventSkillRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected EventSkillId parseId(String id) {
        return ControllerIds.eventSkillId(id);
    }
}
