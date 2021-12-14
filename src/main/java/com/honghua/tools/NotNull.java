package com.honghua.tools;

public class NotNull {
    public static boolean isNotNull(String str){
        if (str==null || "".equals(str.trim())) {
            return true;
        }else{
            return false;
        }
    }
}
