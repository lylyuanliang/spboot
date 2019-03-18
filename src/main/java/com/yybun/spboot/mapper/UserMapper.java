package com.yybun.spboot.mapper;

import com.yybun.spboot.entiry.UserEntiry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select("<script>" +
            "SELECT " +
            "u.pwd," +
            "u.account" +
            " FROM users u WHERE u.account=#{account} " +
            "</script>")
    UserEntiry find(@Param("account") String account);

    void insert(UserEntiry userEntiry);
}
