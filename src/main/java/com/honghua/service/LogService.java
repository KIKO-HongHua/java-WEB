package com.honghua.service;

import com.honghua.dao.PO.User;
import com.honghua.dao.SQLinit;
import com.honghua.tools.Message;
import com.honghua.tools.NotNull;
import com.honghua.dao.find.SQLfind;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class LogService {
    public Message login(String lid, String lpsw) {
        Message msg = new Message();

        User user =User.builder()
                .id(Integer.parseInt(lid))
                .psw(lpsw)
                .build();
        User user1 = new User();

        msg.setObject(user);
        System.out.println(msg.getObject());


        if(NotNull.isNotNull(lid) || NotNull.isNotNull(lpsw)){
            msg.setCode(0);
            msg.setMsg("用户名或密码不能为空");
            return msg;
        }

        try (SqlSession sqlSession = SQLinit.setSqlSession()){
            SQLfind find = sqlSession.getMapper(SQLfind.class);

            User user01 = find.findById(Integer.parseInt(lid));
            if(user01==null){
                msg.setCode(0);
                msg.setMsg("用户不存在");
                return msg;
            }
            user=user01;
            
            
        } catch (IOException e) {e.printStackTrace();}

       if(!lpsw.equals(user.getPsw())){
           msg.setCode(0);
           msg.setMsg("密码错误");
           return msg;
       }

        msg.setCode(1);
        msg.setMsg("登陆成功");
        msg.setObject(user);
        return msg;
    }
}
