package com.fitstepper;

public class GetNdMsAmtIn {
    private final int bui_id;
    private final String bui_name;
    private final int now_amount;
    private final int now_level;

    public GetNdMsAmtIn(int bui_id, String bui_name, int now_amount, int now_level) {
        this.bui_id = bui_id;
        this.bui_name = bui_name;
        this.now_amount = now_amount;
        this.now_level = now_level;
    }

    public int getBui_id() {
        return bui_id;
    }

    public String getBui_name() {
        return bui_name;
    }

    public int getNow_amount() {
        return now_amount;
    }

    public int getNow_level() {
        return now_level;
    }

}
