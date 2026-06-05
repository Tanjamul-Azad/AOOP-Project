package com.cse.project.controller;

import com.cse.project.entity.SkillCreditLedger;
import com.cse.project.repository.SkillCreditLedgerRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skill-credit-ledgers")
public class SkillCreditLedgerController extends AbstractCrudController<SkillCreditLedger, String> {

    public SkillCreditLedgerController(SkillCreditLedgerRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
