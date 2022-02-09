package com.example.Paw.repository;

import com.example.Paw.service.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface UserRepository extends JpaRepository<User, Long> {

}
