package com.nfdeveloper.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nfdeveloper.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
