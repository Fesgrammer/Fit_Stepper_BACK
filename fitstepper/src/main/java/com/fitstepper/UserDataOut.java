package com.fitstepper;

public class UserDataOut {
    private final int user_id;
    private final String name;
    private final int jouwan_two_level;
    private final int jouwan_two_amt;
    private final int jouwan_th_level;
    private final int jouwan_th_amt;
    private final int chest_level;
    private final int chest_amt;
    private final int ads_level;
    private final int ads_amt;
    private final int shoulder_level;
    private final int shoulder_amt;
    private final int back_level;
    private final int back_amt;
    private final int hip_level;
    private final int hip_amt;
    private final int thigh_level;
    private final int thigh_amt;
    private final int calf_level;
    private final int calf_amt;

    public UserDataOut(int user_id, String name, int jouwan_two_level, int jouwan_two_amt, int jouwan_th_level,
            int jouwan_th_amt, int chest_level, int chest_amt, int ads_level, int ads_amt, int shoulder_level,
            int shoulder_amt, int back_level, int back_amt, int hip_level, int hip_amt, int thigh_level, int thigh_amt,
            int calf_level, int calf_amt) {
        this.user_id = user_id;
        this.name = name;
        this.jouwan_two_level = jouwan_two_level;
        this.jouwan_two_amt = jouwan_two_amt;
        this.jouwan_th_level = jouwan_th_level;
        this.jouwan_th_amt = jouwan_th_amt;
        this.chest_level = chest_level;
        this.chest_amt = chest_amt;
        this.ads_level = ads_level;
        this.ads_amt = ads_amt;
        this.shoulder_level = shoulder_level;
        this.shoulder_amt = shoulder_amt;
        this.back_level = back_level;
        this.back_amt = back_amt;
        this.hip_level = hip_level;
        this.hip_amt = hip_amt;
        this.thigh_level = thigh_level;
        this.thigh_amt = thigh_amt;
        this.calf_level = calf_level;
        this.calf_amt = calf_amt;
    }

    public int getuser_id() {// user_id
        return user_id;
    }

    public String getName() {// name
        return name;
    }

    public int getJouwan_two_level() {// jouwanTwo
        return jouwan_two_level;
    }

    public int getJouwan_two_amt() {
        return jouwan_two_amt;
    }

    public int getJouwan_th_level() {// jouwanTh
        return jouwan_th_level;
    }

    public int getJouwan_th_amt() {
        return jouwan_th_amt;
    }

    public int getChest_level() {// chest
        return chest_level;
    }

    public int getChest_amt() {
        return chest_amt;
    }

    public int getAds_level() {// chest
        return ads_level;
    }

    public int getAds_amt() {
        return ads_amt;
    }

    public int getShoulder_level() {// shouder
        return shoulder_level;
    }

    public int getShoulder_amt() {
        return shoulder_amt;
    }

    public int getBack_level() {// back
        return back_level;
    }

    public int getBack_amt() {
        return back_amt;
    }

    public int getHip_level() {// hip
        return hip_level;
    }

    public int getHip_amt() {
        return hip_amt;
    }

    public int getThigh_level() {// thigh
        return thigh_level;
    }

    public int getThigh_amt() {
        return thigh_amt;
    }

    public int getCalf_level() {// calf
        return calf_level;
    }

    public int getCalf_amt() {
        return calf_amt;
    }

}
