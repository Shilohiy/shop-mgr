package com.springboot.shopmgr.userinfo.dto;

import lombok.Data;

/**
 * 接收前端的发送对象
 */
@Data
public class LoginUser {

    private String userName;
    private String userPwd;

}
