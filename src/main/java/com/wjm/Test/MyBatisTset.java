package com.wjm.Test;

import com.wjm.dao.UserMapper;
import com.wjm.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MyBatisTset {
    @Test
    public void run2() throws Exception {
        InputStream in = Resources.getResourceAsStream("MyBatis/SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        SqlSession session = factory.openSession();

        UserMapper dao = session.getMapper(UserMapper.class);

        List<User> list = dao.findAll();
        for (User account: list ) {
            System.out.println(account);
        }

        session.close();
        in.close();
    }




}
