package com.springboot.shopmgr.userinfo.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/userinfo/userInfo")
public class UserInfoController {

//    @RequestMapping("/login")


}
