package com.example.GroceryBookingApp.Repository;

import com.example.GroceryBookingApp.Entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity,Long> {
}
