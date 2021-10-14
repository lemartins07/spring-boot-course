package com.educandoweb.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springbootcourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
