package com.cse.project.controller;

import com.cse.project.entity.Notification;
import com.cse.project.repository.NotificationRepository;
import com.cse.project.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController extends AbstractCrudController<Notification, String> {

    public NotificationController(NotificationRepository repository) {
        super(new CrudService<>(repository));
    }

    @Override
    protected String parseId(String id) {
        return ControllerIds.stringId(id);
    }
}
