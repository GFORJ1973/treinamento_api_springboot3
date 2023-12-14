package com.hgl.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgl.curso.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
