package com.assignment.avaloq.service.save.util;

import com.assignment.avaloq.model.BuzzFizzDatabaseModel;
import org.springframework.stereotype.Component;

import java.util.function.Function;


public class SendToEmail implements Function<BuzzFizzDatabaseModel, String> {

    @Override
    public String apply(BuzzFizzDatabaseModel buzzFizzDatabaseModel) {
//        code to send to email service
        return "Success";
    }
}
