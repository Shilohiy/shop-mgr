package com.springboot.shopmgr.userinfo.controller;


import com.alibaba.fastjson.JSONObject;
import com.springboot.shopmgr.userinfo.dto.LoginUser;
import com.springboot.shopmgr.userinfo.dto.LoginUserResponse;
import com.springboot.shopmgr.userinfo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 *  RestController注释：表示是一个controller类，在项目启动时加载到spring IOC容器中，
 *   -ResponseBody注释：将方法返回的数据类型转换为json格式
 *
 *   RequestMapping注释：定义接口的url路径，如果RequestMapping注释添加在类上，表示该路径是真个url路径的公共部分
 *   在类上的RequestMapping注释 + 方法上的RequestMapping注释 = 接口的完整url路径
 * </p>
 *
 * @author sdx2009
 * @since 2024-06-24
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {

//    @Autowired
    @Resource
    private UserInfoService userInfoService;
    /**
     * RequestBody注释：将前端传递的参数解析成json或者xml格式，要求前端传递的参数是json或者xml格式
     * @param loginUser
     * @return
     */
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @PostMapping("/login")
    public JSONObject login(@RequestBody LoginUser loginUser){
        //将loginUser转发给service处理
        LoginUserResponse res = userInfoService.login(loginUser);
        //将处理结果返回给前端页面
        JSONObject obj =new JSONObject();

        if(!ObjectUtils.isEmpty(res)){
            obj.put("code",200);
            obj.put("msg"," 登陆成功");
            obj.put("data",res);
        }else{
            obj.put("code",500);
            obj.put("msg","登陆失败");
        }

        return obj;
    }

}
