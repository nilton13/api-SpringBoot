package com.nfdeveloper.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nfdeveloper.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
