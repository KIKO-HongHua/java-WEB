package com.honghua.service;

import com.honghua.dao.PO.User;
import com.honghua.dao.SQLinit;
import com.honghua.dao.find.SQLfind;
import com.honghua.dao.update.SQLupdate;
import com.honghua.tools.Message;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class UpdateService {
    public Message upload(User userNew) {
        Message msg = new Message();
        User userOld = new User();
        
        
        try (SqlSession sqlSession = SQLinit.setSqlSession()){
            SQLupdate update = sqlSession.getMapper(SQLupdate.class);
            update.updateById(userNew);
            sqlSession.commit();
        } catch (IOException e) {e.printStackTrace();}

        try (SqlSession sqlSession = SQLinit.setSqlSession()){
            SQLfind find = sqlSession.getMapper(SQLfind.class);
            userOld = find.findById(userNew.getId());
        } catch (IOException e) {e.printStackTrace();}
        

        if( ! userNew.equals(userOld)){
            msg.setCode(0);
            msg.setMsg("修改失败");

        }else{
            msg.setMsg("修改成功");
            msg.setCode(1);
        }

        msg.setObject(userOld);

        return msg;
    }
}
