package com.springboot.shopmgr.userinfo.dto;

import lombok.Data;

/**
 * 返回的前端对象
 */
@Data
public class LoginUserResponse {
    private String userId;
    private String userName;
    private String roleId;
}
