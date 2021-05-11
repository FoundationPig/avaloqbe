package com.assignment.avaloq.service.save.util;

import com.assignment.avaloq.model.BuzzFizzDatabaseModel;
import com.assignment.avaloq.repository.SaveRepository;
import org.springframework.stereotype.Component;

import java.util.function.Function;


public class SaveToDb implements Function<BuzzFizzDatabaseModel, BuzzFizzDatabaseModel> {

    private SaveRepository saveRepository;

    @Override
    public BuzzFizzDatabaseModel apply(BuzzFizzDatabaseModel buzzFizzDatabaseModel) {
        return saveRepository.save(buzzFizzDatabaseModel);
    }
}
