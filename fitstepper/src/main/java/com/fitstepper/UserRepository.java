package com.fitstepper;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    Boolean existsByName(String name);

    User findByUserId(int userId);
}