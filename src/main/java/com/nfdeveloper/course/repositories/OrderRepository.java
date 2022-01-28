package com.nfdeveloper.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nfdeveloper.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
