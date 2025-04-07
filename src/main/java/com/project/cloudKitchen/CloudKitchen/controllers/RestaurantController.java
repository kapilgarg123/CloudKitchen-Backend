package com.project.cloudKitchen.CloudKitchen.controllers;

import com.project.cloudKitchen.CloudKitchen.entities.RestaurantEntity;
import com.project.cloudKitchen.CloudKitchen.services.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping
    public List<RestaurantEntity> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @PostMapping
    public RestaurantEntity createNewRestaurant(@RequestBody RestaurantEntity inputRestaurant) {
        return restaurantService.createNewRestaurant(inputRestaurant);
    }

    @DeleteMapping(path = "/{restaurantId}")
    public boolean deleteRestaurantById(@PathVariable Long restaurantId) {
        return restaurantService.deleteRestaurantById(restaurantId);
    }

}
