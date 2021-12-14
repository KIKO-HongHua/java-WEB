package com.honghua.service;

import com.honghua.dao.PO.User;
import com.honghua.dao.SQLinit;
import com.honghua.dao.find.SQLfind;
import com.honghua.dao.remove.SQLremove;
import com.honghua.tools.Message;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class DeleteService {


    public static Message deleteUser(int id){
        Message msg = new Message();

        try (SqlSession sqlSession = SQLinit.setSqlSession()){
            SQLremove delete = sqlSession.getMapper(SQLremove.class);
            delete.dropById(id);
            sqlSession.commit();
        } catch (IOException e) {e.printStackTrace();}

        try (SqlSession sqlSession = SQLinit.setSqlSession()){
            SQLfind find = sqlSession.getMapper(SQLfind.class);
            User user = find.findById(id);
            if(user!=null){
                msg.setCode(0);
                msg.setMsg("删除失败，请重试");
            }else{
                msg.setCode(1);
                msg.setMsg("删除成功，请重新登录");
            }
            msg.setObject(user);
        } catch (IOException e) {e.printStackTrace();}
        
        
        return msg;
    }
}
