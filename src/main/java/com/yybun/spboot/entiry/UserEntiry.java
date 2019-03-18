package com.yybun.spboot.entiry;

/**
 * 用户实体
 */
public class UserEntiry {
    /**
     * 账号
     */
    private String userAccount;
    /**
     * 用户id
     */
    private String userId;

    private String pwd;

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
