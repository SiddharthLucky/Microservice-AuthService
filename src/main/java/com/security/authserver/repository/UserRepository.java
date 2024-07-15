package com.security.authserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.authserver.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
