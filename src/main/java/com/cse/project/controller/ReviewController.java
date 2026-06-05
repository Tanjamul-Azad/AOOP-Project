package com.cse.project.controller;

import com.cse.project.entity.Review;
import com.cse.project.repository.ReviewRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController extends AbstractCrudController<Review, String> {

    public ReviewController(ReviewRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
