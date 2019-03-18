package com.yybun.spboot.service;

import java.util.Map;

public interface IUserService {

    /**
     * 登陆
     * @param account
     * @param pwd
     * @return
     */
    Map<String, Object> login(String account, String pwd);
}
