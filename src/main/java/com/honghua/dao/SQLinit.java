package com.honghua.dao;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class SQLinit {
    private static SqlSessionFactory SQL_SESSION_FACTORY;
    public static SqlSession setSqlSession () throws IOException {

        if (SQL_SESSION_FACTORY == null) {
            synchronized (SQLinit.class) {
                if (SQL_SESSION_FACTORY == null) {
                    SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
                    //2,加载对应的配置文件
                    try (Reader configReader = Resources.getResourceAsReader("mybatis-config.xml")) {
                        //3,创建SqlSessionFactory,SqlSessionFactory在系统中必须是单例的
                        SQL_SESSION_FACTORY = sessionFactoryBuilder.build(configReader);
                    }
                }
            }
        }
        return SQL_SESSION_FACTORY.openSession();
    }
}
