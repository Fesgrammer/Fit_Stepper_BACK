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
    private int jouwanTwoLevel;
    private int jouwanTwoAmt;
    private int jouwanThLevel;
    private int jouwanThAmt;
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

    public int getJouwanTwoLevel() {// jouwanTwo
        return jouwanTwoLevel;
    }

    public void setJouwanTwoLevel(int jouwanTwoLevel) {
        this.jouwanTwoLevel = jouwanTwoLevel;
    }

    public int getJouwanTwoAmt() {
        return jouwanTwoAmt;
    }

    public void setJouwanTwoAmt(int jouwanTwoAmt) {
        this.jouwanTwoAmt = jouwanTwoAmt;
    }

    public int getJouwanThLevel() {// jouwanTh
        return jouwanThLevel;
    }

    public void setJouwanThLevel(int jouwanThLevel) {
        this.jouwanThLevel = jouwanThLevel;
    }

    public int getJouwanThAmt() {
        return jouwanThAmt;
    }

    public void setJouwanThAmt(int jouwanThAmt) {
        this.jouwanThAmt = jouwanThAmt;
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
