package com.hgl.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgl.curso.entities.OrderItem;

public interface OrdemItemRepository  extends JpaRepository<OrderItem, Long>{

}
