package com.fitstepper;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int userId;
    private String name;
    private String pass;
    private int jouwan2Level;
    private int jouwan2Amt;
    private int jouwan3Level;
    private int jouwan3Amt;
    private int chestLevel;
    private int chestAmt;
    private int adsLevel;
    private int adsAmt;
    private int shoulderLevel;
    private int shoulderAmt;
    private int backLevel;
    private int backAmt;
    private int hipLevel;
    private int hipAmt;
    private int thighLevel;
    private int thighAmt;
    private int calfLevel;
    private int calfAmt;

    public int getuserId() {// userID
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {// name
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {// pass
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getJouwan2Level() {// jouwan2
        return jouwan2Level;
    }

    public void setJouwan2Level(int jouwan2Level) {
        this.jouwan2Level = jouwan2Level;
    }

    public int getJouwan2Amt() {
        return jouwan2Amt;
    }

    public void setJouwan2Amt(int jouwan2Amt) {
        this.jouwan2Amt = jouwan2Amt;
    }

    public int getJouwan3Level() {// jouwan3
        return jouwan3Level;
    }

    public void setJouwan3Level(int jouwan3Level) {
        this.jouwan3Level = jouwan3Level;
    }

    public int getJouwan3Amt() {
        return jouwan3Amt;
    }

    public void setJouwan3Amt(int jouwan3Amt) {
        this.jouwan3Amt = jouwan3Amt;
    }

    public int getChestLevel() {// chest
        return chestLevel;
    }

    public void setChestLevel(int chestLevel) {
        this.chestLevel = chestLevel;
    }

    public int getChestAmt() {
        return chestAmt;
    }

    public void setChestAmt(int chestAmt) {
        this.chestAmt = chestAmt;
    }

    public int getAdsLevel() {// chest
        return adsLevel;
    }

    public void setAdsLevel(int adsLevel) {
        this.adsLevel = adsLevel;
    }

    public int getAdsAmt() {
        return adsAmt;
    }

    public void setAdsAmt(int adsAmt) {
        this.adsAmt = adsAmt;
    }

    public int getShoulderLevel() {// shouder
        return shoulderLevel;
    }

    public void setShoulderLevel(int shoulderLevel) {
        this.shoulderLevel = shoulderLevel;
    }

    public int getShoulderAmt() {
        return shoulderAmt;
    }

    public void setShoulderAmt(int shoulderAmt) {
        this.shoulderAmt = shoulderAmt;
    }

    public int getBackLevel() {// back
        return backLevel;
    }

    public void setBackLevel(int backLevel) {
        this.backLevel = backLevel;
    }

    public int getBackAmt() {
        return backAmt;
    }

    public void setBackAmt(int backAmt) {
        this.backAmt = backAmt;
    }

    public int getHipLevel() {// hip
        return hipLevel;
    }

    public void setHipLevel(int hipLevel) {
        this.hipLevel = hipLevel;
    }

    public int getHipAmt() {
        return hipAmt;
    }

    public void setHipAmt(int hipAmt) {
        this.hipAmt = hipAmt;
    }

    public int getThighLevel() {// thigh
        return thighLevel;
    }

    public void setThighLevel(int thighLevel) {
        this.thighLevel = thighLevel;
    }

    public int getThighAmt() {
        return thighAmt;
    }

    public void setThighAmt(int thighAmt) {
        this.thighAmt = thighAmt;
    }

    public int getCalfLevel() {// calf
        return calfLevel;
    }

    public void setCalfLevel(int calfLevel) {
        this.calfLevel = calfLevel;
    }

    public int getCalfAmt() {
        return calfAmt;
    }

    public void setCalfAmt(int calfAmt) {
        this.calfAmt = calfAmt;
    }

}
