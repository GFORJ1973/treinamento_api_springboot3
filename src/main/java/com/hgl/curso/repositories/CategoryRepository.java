package com.hgl.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgl.curso.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

}
