package com.cse.project.controller;

import com.cse.project.entity.UserSkillWanted;
import com.cse.project.entity.UserSkillWantedId;
import com.cse.project.repository.UserSkillWantedRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user-skills-wanted")
public class UserSkillWantedController extends AbstractCrudController<UserSkillWanted, UserSkillWantedId> {

    public UserSkillWantedController(UserSkillWantedRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected UserSkillWantedId parseId(String id) {
        return ControllerIds.userSkillWantedId(id);
    }
}
