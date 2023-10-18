package com.geekster.RestaurantManagementSystem.factory;

import com.geekster.RestaurantManagementSystem.model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanFactory {

    @Bean
    Map<Integer , Restaurant> getRestaturantMap(){
        return new HashMap<>();
    }
}
