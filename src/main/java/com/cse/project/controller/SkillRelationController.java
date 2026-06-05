package com.cse.project.controller;

import com.cse.project.entity.SkillRelation;
import com.cse.project.entity.SkillRelationId;
import com.cse.project.repository.SkillRelationRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skill-relations")
public class SkillRelationController extends AbstractCrudController<SkillRelation, SkillRelationId> {

    public SkillRelationController(SkillRelationRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected SkillRelationId parseId(String id) {
        return ControllerIds.skillRelationId(id);
    }
}
