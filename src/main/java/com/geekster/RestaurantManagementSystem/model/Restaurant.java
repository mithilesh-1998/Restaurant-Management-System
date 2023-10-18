package com.geekster.RestaurantManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    // restaurant name, restaurant address, number, specialty, total staffs
    private Integer restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantSpeciality;
    private Integer totalStaff;
}
