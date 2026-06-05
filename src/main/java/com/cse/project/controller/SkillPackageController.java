package com.cse.project.controller;

import com.cse.project.entity.SkillPackage;
import com.cse.project.repository.SkillPackageRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skill-packages")
public class SkillPackageController extends AbstractCrudController<SkillPackage, String> {

    public SkillPackageController(SkillPackageRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
