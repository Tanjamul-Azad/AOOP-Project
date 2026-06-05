package com.cse.project.controller;

import com.cse.project.entity.Discussion;
import com.cse.project.repository.DiscussionRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/discussions")
public class DiscussionController extends AbstractCrudController<Discussion, String> {

    public DiscussionController(DiscussionRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
