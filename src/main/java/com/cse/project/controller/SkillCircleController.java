package com.cse.project.controller;

import com.cse.project.entity.SkillCircle;
import com.cse.project.repository.SkillCircleRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skill-circles")
public class SkillCircleController extends AbstractCrudController<SkillCircle, String> {

    public SkillCircleController(SkillCircleRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
