package com.honghua.dao.PO;

import lombok.*;

@Builder

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Data

public class User {
    //学号
    private Integer id;
    //名字
    private String name;
    //性别1->男；0->女
    private Integer sex;
    //年龄
    private Integer age;
    //手机号
    private String phone;
    //邮箱
    private String email;
    //密码
    private String psw;

}
