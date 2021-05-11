package com.assignment.avaloq.service;

import com.assignment.avaloq.model.BuzzFizzDatabaseModel;
import com.assignment.avaloq.service.save.SaveService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class ServicesConfiguration {

    @Bean
    public SaveService saveService(Function<BuzzFizzDatabaseModel, BuzzFizzDatabaseModel> buzzFizzDatabaseModelBuzzFizzDatabaseModelFunction,
                                   Function<BuzzFizzDatabaseModel, String> buzzFizzDatabaseModelStringFunction) {
        SaveService saveService = new SaveService();
        saveService.setSaveToService(buzzFizzDatabaseModelBuzzFizzDatabaseModelFunction);
        saveService.setSendToEmail(buzzFizzDatabaseModelStringFunction);
        return saveService;
    }

}
