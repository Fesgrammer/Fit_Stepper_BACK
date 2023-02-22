package com.fitstepper;

public class Event{

    private final String event_name;
    private final int event_id;

    public Event(String name,int id) {
        super();
        this.event_name = name;
        this.event_id=id;
    }

    public String getname() {
        return event_name;
    }

    public int getID(){
        return event_id;
    }
}