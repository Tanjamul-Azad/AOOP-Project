package com.cse.project.controller;

import com.cse.project.entity.UserSkillOffered;
import com.cse.project.entity.UserSkillOfferedId;
import com.cse.project.repository.UserSkillOfferedRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user-skills-offered")
public class UserSkillOfferedController extends AbstractCrudController<UserSkillOffered, UserSkillOfferedId> {

    public UserSkillOfferedController(UserSkillOfferedRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected UserSkillOfferedId parseId(String id) {
        return ControllerIds.userSkillOfferedId(id);
    }
}
