package com.loosecoupling;

public class UserDataFromWS implements DataProvider{
    @Override
    public String getUserInfo() {
        return "Data from WS";
    }
}
