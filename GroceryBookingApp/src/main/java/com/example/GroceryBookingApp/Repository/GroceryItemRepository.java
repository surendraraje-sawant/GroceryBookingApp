package com.example.GroceryBookingApp.Repository;

import com.example.GroceryBookingApp.Entity.GroceryItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryItemRepository extends JpaRepository<GroceryItemEntity,Long> {

}
