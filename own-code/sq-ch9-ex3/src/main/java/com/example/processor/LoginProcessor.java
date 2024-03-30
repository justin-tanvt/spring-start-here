package com.example.processor;

import com.example.service.LoggedUserManagementService;
import com.example.service.LoginCountService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;
    private String username;
    private String password;

    public LoginProcessor(
            LoggedUserManagementService loggedUserManagementService,
            LoginCountService loginCountService
    ) {
        this.loggedUserManagementService = loggedUserManagementService;
        System.out.println(this.loggedUserManagementService + " autowired as field for " + this);
        this.loginCountService = loginCountService;
        System.out.println(this.loginCountService + " autowired as field for " + this);
        System.out.println(this + " instantiated!");
    }

    public boolean login() {
        loggedUserManagementService.setUsername(this.username);
        this.loginCountService.increment();

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
