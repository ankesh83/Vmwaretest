package com.ankesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankesh.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
