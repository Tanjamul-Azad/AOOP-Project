package com.cse.project.controller;

import com.cse.project.entity.CreditRedemption;
import com.cse.project.repository.CreditRedemptionRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/credit-redemptions")
public class CreditRedemptionController extends AbstractCrudController<CreditRedemption, String> {

    public CreditRedemptionController(CreditRedemptionRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
