package com.loosecoupling;

public class UserDataFromPSQL implements DataProvider{

    @Override
    public String getUserInfo() {
        return "Data from PSQL";
    }
}
