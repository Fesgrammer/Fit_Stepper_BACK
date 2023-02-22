package com.fitstepper;

public class Bui{

    private final String bui_name;
    private final int bui_id;

    public Bui(String name,int id) {
        super();
        this.bui_name = name;
        this.bui_id=id;
    }

    public String getname() {
        return bui_name;
    }

    public int getID(){
        return bui_id;
    }
}