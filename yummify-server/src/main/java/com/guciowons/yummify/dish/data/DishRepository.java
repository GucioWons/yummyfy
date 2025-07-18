package com.guciowons.yummify.dish.data;

import com.guciowons.yummify.dish.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DishRepository extends JpaRepository<Dish, UUID> {
    boolean existsByNameAndRestaurantId(String name, UUID restaurantId);
}
