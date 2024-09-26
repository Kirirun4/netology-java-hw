package ru.netology.springdemoboot.Profile;

public class DevProfile implements SystemProfile{

    @Override
    public String getProfile() {

        return "Current profile is dev";
    }
}