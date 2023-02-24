package com.fitstepper;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int user_id;
    private String name;
    private int pass;
    private int jouwan2_level;
    private int jouwan2_amt;
    private int jouwan3_level;
    private int jouwan3_amt;
    private int chest_level;
    private int chest_amt;
    private int ads_level;
    private int ads_amt;
    private int shoulder_level;
    private int shoulder_amt;
    private int back_level;
    private int back_amt;
    private int hip_level;
    private int hip_amt;
    private int thigh_level;
    private int thigh_amt;
    private int calf_level;
    private int calf_amt;

    public int getUser_id() {// userID
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {// name
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPass() {// pass
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getJouwan2_level() {// jouwan2
        return jouwan2_level;
    }

    public void setJouwan2_level(int jouwan2_level) {
        this.jouwan2_level = jouwan2_level;
    }

    public int getJouwan2_amt() {
        return jouwan2_amt;
    }

    public void setJouwan2_amt(int jouwan2_amt) {
        this.jouwan2_amt = jouwan2_amt;
    }

    public int getJouwan3_level() {// jouwan3
        return jouwan3_level;
    }

    public void setJouwan3_level(int jouwan3_level) {
        this.jouwan3_level = jouwan3_level;
    }

    public int getJouwan3_amt() {
        return jouwan3_amt;
    }

    public void setJouwan3_amt(int jouwan3_amt) {
        this.jouwan3_amt = jouwan3_amt;
    }

    public int getChest_level() {// chest
        return chest_level;
    }

    public void setChest_level(int chest_level) {
        this.chest_level = chest_level;
    }

    public int getChest_amt() {
        return chest_amt;
    }

    public void setChest_amt(int chest_amt) {
        this.chest_amt = chest_amt;
    }

    public int getAds_level() {// chest
        return ads_level;
    }

    public void setAds_level(int ads_level) {
        this.ads_level = ads_level;
    }

    public int getAds_amt() {
        return ads_amt;
    }

    public void setAds_amt(int ads_amt) {
        this.ads_amt = ads_amt;
    }

    public int getShoulder_level() {// shouder
        return shoulder_level;
    }

    public void setShoulder_level(int shoulder_level) {
        this.shoulder_level = shoulder_level;
    }

    public int getShoulder_amt() {
        return shoulder_amt;
    }

    public void setShoulder_amt(int shoulder_amt) {
        this.shoulder_amt = shoulder_amt;
    }

    public int getBack_level() {// back
        return back_level;
    }

    public void setBack_level(int back_level) {
        this.back_level = back_level;
    }

    public int getBack_amt() {
        return back_amt;
    }

    public void setBack_amt(int back_amt) {
        this.back_amt = back_amt;
    }

    public int getHip_level() {// hip
        return hip_level;
    }

    public void setHip_level(int hip_level) {
        this.hip_level = hip_level;
    }

    public int getHip_amt() {
        return hip_amt;
    }

    public void setHip_amt(int hip_amt) {
        this.hip_amt = hip_amt;
    }

    public int getThigh_level() {// thigh
        return thigh_level;
    }

    public void setThigh_level(int thigh_level) {
        this.thigh_level = thigh_level;
    }

    public int getThigh_amt() {
        return thigh_amt;
    }

    public void setThigh_amt(int thigh_amt) {
        this.thigh_amt = thigh_amt;
    }

    public int getCalf_level() {// calf
        return calf_level;
    }

    public void setCalf_level(int calf_level) {
        this.calf_level = calf_level;
    }

    public int getCalf_amt() {
        return calf_amt;
    }

    public void setCalf_amt(int calf_amt) {
        this.calf_amt = calf_amt;
    }

}
