package com.cse.project.controller;

import com.cse.project.entity.Exchange;
import com.cse.project.repository.ExchangeRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exchanges")
public class ExchangeController extends AbstractCrudController<Exchange, String> {

    public ExchangeController(ExchangeRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
