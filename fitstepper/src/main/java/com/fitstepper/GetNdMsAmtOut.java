package com.fitstepper;

public class GetNdMsAmtOut {
    private final int bui_id;
    private final String bui_name;
    private final int next_level;
    private final int need_amount;

    public GetNdMsAmtOut(int bui_id, String bui_name, int next_level, int need_amount) {
        this.bui_id = bui_id;
        this.bui_name = bui_name;
        this.next_level = next_level;
        this.need_amount = need_amount;
    }

    public int getBui_id() {
        return bui_id;
    }

    public String getBui_name() {
        return bui_name;
    }

    public int getNext_level() {
        return next_level;
    }

    public int getNeed__amount() {
        return need_amount;
    }

}
