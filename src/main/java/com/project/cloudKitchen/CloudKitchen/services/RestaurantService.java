package com.project.cloudKitchen.CloudKitchen.services;

import com.project.cloudKitchen.CloudKitchen.entities.RestaurantEntity;
import com.project.cloudKitchen.CloudKitchen.repositories.RestaurantRepository;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<RestaurantEntity> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public RestaurantEntity createNewRestaurant(RestaurantEntity inputRestaurant) {
        return restaurantRepository.save(inputRestaurant);
    }

    public boolean isExistsByRestaurantId(Long restaurantId) {
        return restaurantRepository.existsById(restaurantId);
    }

    public boolean deleteRestaurantById(Long restaurantId) {
        boolean exists = isExistsByRestaurantId(restaurantId);
        if(!exists) return false;
        restaurantRepository.deleteById(restaurantId);
        return true;
    }
}
