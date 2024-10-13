package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class LoginCountService {

    private int count;

    public LoginCountService() {
        this.count = 0;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return this.count;
    }
}
