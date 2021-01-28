package com.sy.servlet;

import com.sy.domain.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServletUser {
    public List<Users> selectUsers();
    public Integer insertUser(Users users);
    public Users selectoneUser2( int id,String name);
}
