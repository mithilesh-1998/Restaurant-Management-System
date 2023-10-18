package com.geekster.RestaurantManagementSystem.controller;

import com.geekster.RestaurantManagementSystem.model.Restaurant;
import com.geekster.RestaurantManagementSystem.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    //getallrestaurant

    @GetMapping("restaurant")
    public Map<Integer, Restaurant> getAllRestaurant(){
        return restaurantService.getallRestaurant();
    }
    //add multiple restaurant
    @PostMapping("restaurant")
    public String addAllR(@RequestBody List<Restaurant> restaurants){
        return restaurantService.addallrestaurant(restaurants);
    }
    @DeleteMapping("restaurant/{rId}")
    public String removeRestaurant(@PathVariable Integer rId){
        return restaurantService.removeRestaurant(rId);
    }
    //get Restaurant by id using GetMapping.
    @GetMapping("restaurant/rId/{rId}")
    public Restaurant getResatuarantbyId(@PathVariable Integer rId){

        return restaurantService.getRestaurantbyId(rId);
    }
    //update Restaurant information like Specialty.
    @PutMapping("restaurant/{rId}")
    public String updateRestaurantSpeciality(@PathVariable Integer rId, @RequestBody Restaurant updatedSpeciality) {
        Restaurant restaurant = restaurantService.getRestaurantbyId(rId);
        if (restaurant != null) {
            restaurant.setRestaurantSpeciality(updatedSpeciality.getRestaurantSpeciality());

            return rId + " updated";
        }
        return "restaurant not found";
    }
}
