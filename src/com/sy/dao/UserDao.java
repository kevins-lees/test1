package com.sy.dao;



import com.sy.domain.Users;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface UserDao {
    public List<Users>  selectUsers();
    public Integer insertUser(Users users);
    public List<Users> selectoneUser(int id);
    public Users selectoneUser2(@Param("id") int id, @Param("name")String name);
    public HashMap<String,Object> selectoneUser3(@Param("id") int id, @Param("name")String name);
}
