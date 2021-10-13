package com.educandoweb.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springbootcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
