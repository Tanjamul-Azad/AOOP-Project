package com.cse.project.controller;

import com.cse.project.entity.Message;
import com.cse.project.repository.MessageRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController extends AbstractCrudController<Message, String> {

    public MessageController(MessageRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
