package com.fitstepper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MotionRepository extends JpaRepository<Motion, String> {
    Boolean existsByUserId(int userId);

    List<Motion> findByUserId(int userId);
}