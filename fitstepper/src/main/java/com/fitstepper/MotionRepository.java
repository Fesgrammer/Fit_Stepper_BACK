package com.fitstepper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MotionRepository extends JpaRepository<Motion, String> {
    List<Motion> findByUserId(int userId);
}