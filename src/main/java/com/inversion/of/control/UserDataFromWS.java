package com.inversion.of.control;

public class UserDataFromWS implements DataProvider {
    //private String userInfo;

    @Override
    public String getUserInfo() {
        return "Data from WS";
    }


}
