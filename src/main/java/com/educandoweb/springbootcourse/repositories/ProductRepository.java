package com.educandoweb.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springbootcourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
