package com.fitstepper;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bui {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bui_id;
    private String bui_name;

    public int getBui_id() {
        return bui_id;
    }

    public void setBui_id(int bui) {
        this.bui_id = bui;
    }

    public String getBui_name() {
        return bui_name;
    }

    public void setBui_name(String name) {
        this.bui_name = name;
    }

}