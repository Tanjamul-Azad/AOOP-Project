package com.cse.project.controller;

import com.cse.project.entity.SkillCreditWallet;
import com.cse.project.repository.SkillCreditWalletRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skill-credit-wallets")
public class SkillCreditWalletController extends AbstractCrudController<SkillCreditWallet, String> {

    public SkillCreditWalletController(SkillCreditWalletRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
