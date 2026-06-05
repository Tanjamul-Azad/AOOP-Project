package com.cse.project.controller;

import com.cse.project.entity.Session;
import com.cse.project.repository.SessionRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sessions")
public class SessionController extends AbstractCrudController<Session, String> {

    public SessionController(SessionRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
