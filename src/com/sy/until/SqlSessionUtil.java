package com.sy.until;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    private static SqlSessionFactory factory;
    private static ThreadLocal<SqlSession> t =new ThreadLocal<>();

    private SqlSessionUtil() {}

    static{
        String config = "mybatis-config.xml";
        try {
            InputStream in = Resources.getResourceAsStream(config);
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static SqlSession getSqlSession(){
        SqlSession session = t.get();
        if(session==null){
            session=factory.openSession();//非自动提交事务
            t.set(session);
        }

        return session;
    }
    public static void closeSqlSession(SqlSession sqlSession){
        if(sqlSession!=null){
            sqlSession.close();
            t.remove();
        }
    }

}
