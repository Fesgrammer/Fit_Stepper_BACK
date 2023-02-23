package com.fitstepper;


import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Event, String> {

}