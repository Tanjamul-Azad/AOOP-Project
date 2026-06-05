package com.cse.project.controller;

import com.cse.project.entity.SkillCircleSkill;
import com.cse.project.entity.SkillCircleSkillId;
import com.cse.project.repository.SkillCircleSkillRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skill-circle-skills")
public class SkillCircleSkillController extends AbstractCrudController<SkillCircleSkill, SkillCircleSkillId> {

    public SkillCircleSkillController(SkillCircleSkillRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected SkillCircleSkillId parseId(String id) {
        return ControllerIds.skillCircleSkillId(id);
    }
}
