package com.fan.modeldesign.model;

/**
 * Created by fan on 2017/8/21.
 */

public class LoginRequestBean {
    /**
     * userNameOrEmailAddress : string
     * password : string
     * twoFactorVerificationCode : string
     * rememberClient : true
     * twoFactorRememberClientToken : string
     * code : string
     */

    private String userNameOrEmailAddress;
    private String password;
    private String code;

    public String getUserNameOrEmailAddress() {
        return userNameOrEmailAddress;
    }

    public void setUserNameOrEmailAddress(String userNameOrEmailAddress) {
        this.userNameOrEmailAddress = userNameOrEmailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
