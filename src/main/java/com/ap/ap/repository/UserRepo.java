package com.ap.ap.repository;

import com.ap.ap.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo  extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
