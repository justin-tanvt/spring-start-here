package com.example.processor;

import org.springframework.stereotype.Component;

@Component
public class LoginProcessor {
    private String username;
    private String password;

    public boolean login() {
        if (this.username.equals("natalie") && this.password.equals("password")) {
            return true;
        } else {
            return false;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
