package com.nfdeveloper.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nfdeveloper.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
