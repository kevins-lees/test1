package com.sy;

import com.sy.domain.Users;
import com.sy.servlet.ServletUser;
import com.sy.servlet.impl.ServletUserImpl;
import com.sy.until.ServletFactory;

import java.util.List;

public class Test {
    public static void main(String[] args) {
//        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
//        UserDao mapper = sqlSession.getMapper(UserDao.class);
//        List<Users> users = mapper.selectUsers();
//        List<Users>  users = sqlSession.selectList("com.sy.dao.UserDao.selectUsers");
//                for (Users user : users) {
//            System.out.println(user);
//        }
//        SqlSessionUtil.closeSqlSession(sqlSession);
//

        ServletUser servletUser= (ServletUser) ServletFactory.getServlet(new ServletUserImpl());
//        List<Users> users1 = servletUser.selectUsers();
//        for (Users users : users1) {
//            System.out.println(users);
//        }
//        Users users = new Users();
//        users.setId(25);
//        users.setUsername("abcdefg");
//        users.setPassword("1231");
//        users.setName("玩士大夫");
//        users.setPhone("123124");
//        users.setAddr("王阿萨德");
//        users.setAdmin("1");
//        servletUser.insertUser(users);
        Users uu123 = servletUser.selectoneUser2(21, "uu123");
        System.out.println(uu123);
        System.out.println(uu123);
        System.out.println(uu123);
        System.out.println(uu123);
        System.out.println("阿斯顿福建卡士大夫看见啊是的咖啡机暗红色的会计复核");

    }

}
