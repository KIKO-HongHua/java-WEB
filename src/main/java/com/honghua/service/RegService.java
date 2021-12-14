package com.honghua.service;

import com.honghua.dao.PO.User;
import com.honghua.dao.SQLinit;
import com.honghua.dao.add.SQLadd;
import com.honghua.tools.Message;
import com.honghua.tools.NotNull;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.Set;

public class RegService {
    public Message register(User user) {
        Message msg = new Message();

        msg.setObject(user);

        System.out.println(msg.getMsg());
        System.out.println(msg.getObject());

        if(NotNull.isNotNull(String.valueOf(user.getId()))){
            msg.setCode(0);
            msg.setMsg("学号不能为空");
            return msg;
        }

        if(NotNull.isNotNull(user.getName())){
            msg.setCode(0);
            msg.setMsg("用户名不能为空");
            return msg;
        }

        if(NotNull.isNotNull(user.getPsw())){
            msg.setCode(0);
            msg.setMsg("密码不能为空");
            return msg;
        }

        
        
        try (SqlSession sqlSession = SQLinit.setSqlSession()){
            SQLadd add = sqlSession.getMapper(SQLadd.class);
            int res = add.reg(user);
            sqlSession.commit();
            
            if (res==1){
                msg.setMsg("注册成功");
                msg.setCode(1);
            }else{
                msg.setMsg("注册失败,服务器错误");
                msg.setCode(0);
            }
        } catch (IOException e) {e.printStackTrace();}


        return msg;
    }

}
