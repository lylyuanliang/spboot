package com.yybun.spboot.service.impl;

import com.yybun.spboot.entiry.UserEntiry;
import com.yybun.spboot.mapper.UserMapper;
import com.yybun.spboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public Map<String, Object> login(String account, String pwd) {
        Map<String, Object> re = new HashMap<>();
        re.put("result", "login fail");
        UserEntiry user = userMapper.find(account);

        String password = user.getPwd();

        if(pwd.equals(password)) {
            re.put("result", "login success");
        }

        return re;
    }
}
