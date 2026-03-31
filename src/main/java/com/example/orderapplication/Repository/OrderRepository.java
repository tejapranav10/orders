package com.example.orderapplication.Repository;

import com.example.orderapplication.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
