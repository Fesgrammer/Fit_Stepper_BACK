package com.fitstepper;

public class UpdateUsrDataIn {
    private final int user_id;
    private final int bui_id;
    private final int new_level;
    private final int total_amount;

    public UpdateUsrDataIn(int user_id, int bui_id, int new_level, int total_amount) {
        super();
        this.user_id = user_id;
        this.bui_id = bui_id;
        this.new_level = new_level;
        this.total_amount = total_amount;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getBui_id() {
        return bui_id;
    }

    public int getNew_level() {
        return new_level;
    }

    public int getTotal_amount() {
        return total_amount;
    }

}
