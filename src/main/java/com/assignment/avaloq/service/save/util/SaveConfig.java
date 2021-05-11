package com.assignment.avaloq.service.save.util;

import com.assignment.avaloq.model.BuzzFizzDatabaseModel;
import com.assignment.avaloq.model.BuzzFizzModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.BiFunction;
import java.util.function.Function;

@Configuration
public class SaveConfig {

    @Bean
    public BiFunction<Boolean, BuzzFizzModel, BuzzFizzDatabaseModel> booleanBuzzFizzModelBuzzFizzDatabaseModelBiFunction() {
        return new BuzzFizzModelToBuzzFizzDataModelMapper();
    }

    @Bean
    Function<BuzzFizzDatabaseModel, BuzzFizzDatabaseModel> buzzFizzDatabaseModelBuzzFizzDatabaseModelFunction() {
        return new SaveToDb();
    }

    @Bean
    Function<BuzzFizzDatabaseModel, String> sendToEmail() {
        return new SendToEmail();
    }

}
