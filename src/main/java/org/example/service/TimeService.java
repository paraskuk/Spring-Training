package org.example.service;

public class TimeService {
    private final boolean isActive;

    public TimeService(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isActive() {
        return isActive;
    }
}