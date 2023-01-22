package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{


	Product findByName(String name);
}
