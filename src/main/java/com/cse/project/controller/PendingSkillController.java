package com.cse.project.controller;

import com.cse.project.entity.PendingSkill;
import com.cse.project.repository.PendingSkillRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pending-skills")
public class PendingSkillController extends AbstractCrudController<PendingSkill, String> {

    public PendingSkillController(PendingSkillRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
