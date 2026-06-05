package com.cse.project.controller;

import com.cse.project.entity.Skill;
import com.cse.project.repository.SkillRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skills")
public class SkillController extends AbstractCrudController<Skill, String> {

    public SkillController(SkillRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
