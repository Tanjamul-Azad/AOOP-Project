package com.cse.project.controller;

import com.cse.project.entity.SkillEmbedding;
import com.cse.project.repository.SkillEmbeddingRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skill-embeddings")
public class SkillEmbeddingController extends AbstractCrudController<SkillEmbedding, String> {

    public SkillEmbeddingController(SkillEmbeddingRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
