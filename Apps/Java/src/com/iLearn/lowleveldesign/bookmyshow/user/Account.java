package com.iLearn.lowleveldesign.bookmyshow.user;

import com.iLearn.lowleveldesign.bookmyshow.enums.AccountStatus;

public class Account extends Person {
    String id;
    String password;

    AccountStatus status;

    public boolean resetPassword(){
        return true;
    }

}
