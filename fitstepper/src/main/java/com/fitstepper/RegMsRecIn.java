package com.fitstepper;

public class RegMsRecIn {
    private final int user_id;
    private final int bui_id;
    private final int event_id;
    private final int amount;
    private final String date;

    public RegMsRecIn(int user_id, int bui_id, int event_id, int amount, String date) {
        super();
        this.user_id = user_id;
        this.bui_id = bui_id;
        this.event_id = event_id;
        this.amount = amount;
        this.date = date;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getBui_id() {
        return bui_id;
    }

    public int getEvent_id() {
        return event_id;
    }

    public int getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
}
