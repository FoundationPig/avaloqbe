package com.assignment.avaloq.service.save.util;

import com.assignment.avaloq.model.BuzzFizzDatabaseModel;
import com.assignment.avaloq.model.BuzzFizzModel;

import java.util.function.BiFunction;

public class BuzzFizzModelToBuzzFizzDataModelMapper implements BiFunction<Boolean, BuzzFizzModel, BuzzFizzDatabaseModel> {

    @Override
    public BuzzFizzDatabaseModel apply(Boolean aBoolean, BuzzFizzModel buzzFizzModel) {
        if(aBoolean) {
            return new BuzzFizzDatabaseModel();
        }
        return null;
    }
}
