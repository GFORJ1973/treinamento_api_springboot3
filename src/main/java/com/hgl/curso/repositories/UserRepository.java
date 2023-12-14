package com.hgl.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgl.curso.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
