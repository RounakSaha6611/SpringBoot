package com.loosecoupling;

//Class that helps to fetch the getUserInfo() from different classes.

public class UserManager {
    public DataProvider dataProvider;

    public UserManager (DataProvider dataProvider)
    {
        this.dataProvider = dataProvider;
    }

    public String getUserInfo()
    {
        return dataProvider.getUserInfo();
    }
}
