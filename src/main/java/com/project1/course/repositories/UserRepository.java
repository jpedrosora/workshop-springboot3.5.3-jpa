package com.project1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project1.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
