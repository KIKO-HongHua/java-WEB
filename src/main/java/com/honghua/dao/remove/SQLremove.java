package com.honghua.dao.remove;

import com.honghua.dao.PO.User;
import org.apache.ibatis.annotations.Delete;

public interface SQLremove {
    int dropById(int id);
}
