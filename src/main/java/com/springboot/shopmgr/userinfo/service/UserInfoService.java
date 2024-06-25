package com.springboot.shopmgr.userinfo.service;

import com.springboot.shopmgr.userinfo.dto.LoginUser;
import com.springboot.shopmgr.userinfo.dto.LoginUserResponse;
import com.springboot.shopmgr.userinfo.entity.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 *  接口：只做方法声明
 *  接口中所有方法都是public，可以不定义public
 * </p>
 *
 * @author sdx2009
 * @since 2024-06-24
 */
public interface UserInfoService extends IService<UserInfo> {

    LoginUserResponse login(LoginUser loginUser);
}
