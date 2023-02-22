package com.fitstepper;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int event_id;
    private String event_name;

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int id) {
        this.event_id = id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String name) {
        this.event_name = name;
    }
}
