package com.honghua.dao.find;

import com.honghua.dao.PO.User;


public interface SQLfind {
    User findById(int id);
    User findByName(String name);
    User findByEmail(String Email);
    User findByPhone(String phone);
    String findPsw(int id);
}
