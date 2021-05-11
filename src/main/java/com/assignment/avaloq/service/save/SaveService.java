package com.assignment.avaloq.service.save;

import com.assignment.avaloq.model.BuzzFizzDatabaseModel;
import com.assignment.avaloq.model.BuzzFizzModel;

import java.util.function.Function;

public class SaveService {
    private Function<BuzzFizzDatabaseModel, String> sendToEmail;
    private Function<BuzzFizzDatabaseModel, BuzzFizzDatabaseModel> saveToService;

    public void setSendToEmail(Function<BuzzFizzDatabaseModel, String> sendToEmail) {
        this.sendToEmail = sendToEmail;
    }

    public void setSaveToService(Function<BuzzFizzDatabaseModel, BuzzFizzDatabaseModel> saveToService) {
        this.saveToService = saveToService;
    }

    public String save(BuzzFizzModel buzzFizzModel) {
        return saveToService.andThen(sendToEmail).apply(new BuzzFizzDatabaseModel());
    }
}
