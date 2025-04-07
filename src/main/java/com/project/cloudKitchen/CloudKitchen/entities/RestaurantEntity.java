package com.project.cloudKitchen.CloudKitchen.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "restaurants_table")
public class RestaurantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String address;

    private String city;

    private String state;

    private int pinCode;

    private Boolean isActive;

}
