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
    
    public int getuserid() {//userID
        return user_id;
    }

    public void setUserId(String date) {
        this.user_id = user_id;
    }

    public String getname() {//name
        return name;
    }

    public void setname(String date) {
        this.name =name;
    }

    public int getpass() {//pass
        return pass;
    }

    public void setpass(String date) {
        this.pass = pass;
    }

    public int getjouwan2_level() {//jouwan2
        return jouwan2_level;
    }

    public void setjouwan2_level(String date) {
        this.jouwan2_level = jouwan2_level;
    }
    
    public int getjouwan2_amt() {
        return jouwan2_amt;
    }

    public void setjouwan2_amt(String date) {
        this.jouwan2_amt = jouwan2_amt;
    }
    
    public int getjouwan3_level() {//jouwan3
        return jouwan3_level;
    }

    public void setjouwan3_level(String date) {
        this.jouwan3_level = jouwan3_level;
    }


    public int getjouwan3_amt() {
        return jouwan3_amt;
    }

    public void setjouwan3_amt(String date) {
        this.jouwan3_amt = jouwan3_amt;
    }

    public int getchestlevel() {//chest
        return chest_level;
    }

    public void setchestlevel(String date) {
        this.chest_level = chest_level;
    }

    public int getchestamt() {
        return chest_amt;
    }

    public void setchestamt(String date) {
        this.chest_amt = chest_amt;
    }

    public int getshoulderlevel() {//shouder
        return shoulder_level;
    }

    public void setshoulderlevel(String date) {
        this.shoulder_level = shoulder_level;
    }

    public int getshoulderamt() {
        return shoulder_amt;
    }

    public void setshoulderamt(String date) {
        this.shoulder_amt = shoulder_amt;
    }

    public int getbacklevel() {//back
        return back_level;
    }

    public void setbacklevel(String date) {
        this.back_level = back_level;
    }

    public int getbackamt() {
        return back_level;
    }

    public void setbackamt(String date) {
        this.back_amt= back_amt;
    }

    
    public int gethiplevel() {//hip
        return hip_level;
    }

    public void sethiplevel(String date) {
        this.hip_level = hip_level;
    }

    public int gethipamt() {
        return hip_amt;
    }

    public void sethipamt(String date) {
        this.hip_amt = hip_amt;
    }

    public int getthighlevel() {//thigh
        return thigh_level;
    }

    public void setthighlevel(String date) {
        this.thigh_level = thigh_level;
    }

    
    public int getthighamt() {
        return thigh_amt;
    }

    public void setthighamt(String date) {
        this.thigh_amt = thigh_amt;
    }

   public int getcalflevel() {//calf
        return calf_level;
    }

    public void setcalflevel(String date) {
        this.calf_level = calf_level;
    }

    public int getcalfamt() {
        return calf_amt;
    }

    public void setcalfatm(String date) {
        this.calf_amt = calf_amt;
    }

}
