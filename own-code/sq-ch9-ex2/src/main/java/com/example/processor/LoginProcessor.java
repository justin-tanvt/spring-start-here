package com.example.processor;

import com.example.service.LoggedUserManagementService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

    private final LoggedUserManagementService loggedUserManagementService;
    private String username;
    private String password;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
        System.out.println(this.loggedUserManagementService + " autowired as field for " + this);
        System.out.println(this + " instantiated!");
    }

    public boolean login() {
        if (this.username.equals("natalie") && this.password.equals("password")) {
            loggedUserManagementService.setUsername(this.username);
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
