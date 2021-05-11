package com.assignment.avaloq.service.save;

import com.assignment.avaloq.model.BuzzFizzModel;
import org.springframework.stereotype.Component;

@Component
public class ServiceFacade {

    private SaveService saveService;

    public String impl() {
        return saveService.save(new BuzzFizzModel());
    }
}
