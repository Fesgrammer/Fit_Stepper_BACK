package com.fitstepper;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Motion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int motion_id;
    private int user_id;
    private int bui_id;
    private int event_id;
    private int amount;
    private String date;

    public int getMotion_id() {
        return motion_id;
    }

    public void setMotion_id(int motion_id) {
        this.motion_id = motion_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBui_id() {
        return bui_id;
    }

    public void setBui_id(int bui_id) {
        this.bui_id = bui_id;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
