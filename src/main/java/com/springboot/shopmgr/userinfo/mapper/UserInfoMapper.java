package com.springboot.shopmgr.userinfo.mapper;

import com.springboot.shopmgr.userinfo.dto.LoginUserResponse;
import com.springboot.shopmgr.userinfo.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Map;

/**
 * <p>
 *  Mapper 接口：只做方法声明，方法名和xml文件中的sql语句一一对应
 * </p>
 *
 * @author sdx2009
 * @since 2024-06-24
 */
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    LoginUserResponse selectUserByLogin(Map<String,Object> params);

}
