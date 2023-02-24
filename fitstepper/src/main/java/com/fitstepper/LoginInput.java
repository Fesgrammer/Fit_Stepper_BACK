package com.fitstepper;

public class LoginInput {
    private final String name;
    private final String pass_row;

    public LoginInput(String name, String pass_row) {
        super();
        this.name = name;
        this.pass_row = pass_row;
    }

    public String getName() {
        return name;
    }

    public String getPass_pow() {
        return pass_row;
    }

}
