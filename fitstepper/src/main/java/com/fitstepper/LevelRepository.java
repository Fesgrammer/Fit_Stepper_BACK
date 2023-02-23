package com.fitstepper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelRepository extends JpaRepository<Level, String> {
    List<Level> findByBuiIdOrderByAmountAsc(int buiId);

    Level findByBuiIdAndLevel(int buiId, int level);
}