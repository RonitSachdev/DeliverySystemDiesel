package com.example.petroldelivery;

public class Users {
    String userName;

    String userOrgName;
    String userOrgAdd;
    String userPhone;
    String userQuantity;

    public Users(){

    }

    public Users(String userName, String userOrgName, String userOrgAdd, String userPhone, String userQuantity) {
        this.userName = userName;

        this.userOrgName = userOrgName;
        this.userOrgAdd = userOrgAdd;
        this.userPhone = userPhone;
        this.userQuantity = userQuantity;
    }

    public String getUserName() {
        return userName;
    }



    public String getUserOrgName() {
        return userOrgName;
    }

    public String getUserOrgAdd() {
        return userOrgAdd;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public String getUserQuantity() {
        return userQuantity;
    }
}
