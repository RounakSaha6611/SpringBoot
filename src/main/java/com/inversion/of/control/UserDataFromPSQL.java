package com.inversion.of.control;

public class UserDataFromPSQL implements DataProvider {

    //private String userInfo;

    @Override
    public String getUserInfo() {
        return "Data from PSQL";
    }


}
