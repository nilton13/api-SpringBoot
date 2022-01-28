package com.nfdeveloper.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nfdeveloper.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
