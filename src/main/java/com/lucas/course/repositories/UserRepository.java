package com.lucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
