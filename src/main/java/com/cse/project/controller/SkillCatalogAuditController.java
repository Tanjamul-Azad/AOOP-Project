package com.cse.project.controller;

import com.cse.project.entity.SkillCatalogAudit;
import com.cse.project.repository.SkillCatalogAuditRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skill-catalog-audits")
public class SkillCatalogAuditController extends AbstractCrudController<SkillCatalogAudit, String> {

    public SkillCatalogAuditController(SkillCatalogAuditRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
