package com.springboot.shopmgr.userinfo.service.impl;

import com.springboot.shopmgr.userinfo.dto.LoginUser;
import com.springboot.shopmgr.userinfo.dto.LoginUserResponse;
import com.springboot.shopmgr.userinfo.entity.UserInfo;
import com.springboot.shopmgr.userinfo.mapper.UserInfoMapper;
import com.springboot.shopmgr.userinfo.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sdx2009
 * @since 2024-06-24
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;
    @Override
    public LoginUserResponse login(LoginUser loginUser) {
        //封装mapper查询的参数
        Map<String,Object> params = new HashMap<>();
        params.put("userName",loginUser.getUserName());
        params.put("userPwd",loginUser.getUserPwd());

        LoginUserResponse res = userInfoMapper.selectUserByLogin(params);
        return res;
    }

}
