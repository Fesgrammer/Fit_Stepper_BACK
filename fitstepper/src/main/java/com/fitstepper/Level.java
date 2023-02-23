package com.fitstepper;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int revelId;
    private int buiId;
    private int level;
    private int amount;

    public int getRevelId() {
        return revelId;
    }

    public void setRevelId(int revelId) {
        this.revelId = revelId;
    }

    public int getBuiId() {
        return buiId;
    }

    public void setBuiId(int buiId) {
        this.buiId = buiId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
