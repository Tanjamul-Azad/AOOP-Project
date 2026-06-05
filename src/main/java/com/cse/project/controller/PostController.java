package com.cse.project.controller;

import com.cse.project.entity.Post;
import com.cse.project.repository.PostRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController extends AbstractCrudController<Post, String> {

    public PostController(PostRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
