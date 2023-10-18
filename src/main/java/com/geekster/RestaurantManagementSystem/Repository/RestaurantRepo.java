package com.geekster.RestaurantManagementSystem.Repository;

import com.geekster.RestaurantManagementSystem.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class RestaurantRepo {

    @Autowired
    Map<Integer , Restaurant> restaurant;


    public Map<Integer, Restaurant> getAllRestaurant() {
        return restaurant;
    }

    public Restaurant getRestaurantbyId(Integer rId) {
        return restaurant.get(rId);
    }
}
