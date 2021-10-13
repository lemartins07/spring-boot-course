package com.educandoweb.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springbootcourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
