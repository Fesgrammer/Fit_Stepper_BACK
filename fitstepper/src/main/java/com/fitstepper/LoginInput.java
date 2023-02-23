package com.fitstepper;

public class LoginInput {
    private final String name;
    private final int pass_row;

    public LoginInput(String name,int pass_row){
        super();
        this.name=name;
        this.pass_row=pass_row;
    }

    public String getname() {
        return name;
    }

    public int getpass_pow() {
        return pass_row;
    }


}
