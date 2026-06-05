package com.cse.project.controller;

import com.cse.project.entity.SkillCircleMember;
import com.cse.project.entity.SkillCircleMemberId;
import com.cse.project.repository.SkillCircleMemberRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skill-circle-members")
public class SkillCircleMemberController extends AbstractCrudController<SkillCircleMember, SkillCircleMemberId> {

    public SkillCircleMemberController(SkillCircleMemberRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected SkillCircleMemberId parseId(String id) {
        return ControllerIds.skillCircleMemberId(id);
    }
}
