package com.geekster.RestaurantManagementSystem.service;

import com.geekster.RestaurantManagementSystem.Repository.RestaurantRepo;
import com.geekster.RestaurantManagementSystem.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public Map<Integer, Restaurant> getallRestaurant() {

        return restaurantRepo.getAllRestaurant();
    }

    public String addallrestaurant(List<Restaurant> restaurants) {

        Map<Integer, Restaurant> restaurantList= getallRestaurant();
        for( Restaurant restaurant : restaurants){

            restaurantList.put(restaurant.getRestaurantId() , restaurant);
        }
        return "products are added";
    }

    public String removeRestaurant(Integer rId) {
        Map<Integer, Restaurant> restaurantList= getallRestaurant();
        Restaurant restaurant= restaurantList.get(rId);
        if(restaurant !=null){
            restaurantList.remove(rId);
            return rId +  " removed";
        }else{
            return rId + " Not Found";
        }
    }

    public Restaurant getRestaurantbyId(Integer rId) {
        return restaurantRepo.getRestaurantbyId(rId);

    }
}
