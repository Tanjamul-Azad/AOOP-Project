package com.cse.project.controller;

import com.cse.project.entity.Connection;
import com.cse.project.repository.ConnectionRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/connections")
public class ConnectionController extends AbstractCrudController<Connection, String> {

    public ConnectionController(ConnectionRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
