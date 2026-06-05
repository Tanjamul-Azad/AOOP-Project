package com.cse.project.controller;

import com.cse.project.entity.Story;
import com.cse.project.repository.StoryRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stories")
public class StoryController extends AbstractCrudController<Story, String> {

    public StoryController(StoryRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
