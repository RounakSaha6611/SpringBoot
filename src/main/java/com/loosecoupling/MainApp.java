package com.loosecoupling;

public class MainApp {
    public static void main(String[] args) {
        //Object of interface from required class.
        DataProvider dataPSQLProvider = new UserDataFromPSQL();
        UserManager dataFromPSQL = new UserManager(dataPSQLProvider);
        System.out.println(dataFromPSQL.getUserInfo());

        DataProvider dataWSProvider = new UserDataFromWS();
        UserManager dataFromWS = new UserManager(dataWSProvider);
        System.out.println(dataFromWS.getUserInfo());

    }
}
