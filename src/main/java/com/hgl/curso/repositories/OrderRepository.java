package com.hgl.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgl.curso.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
