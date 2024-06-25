package com.springboot.shopmgr.userinfo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author sdx2009
 * @since 2024-06-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private String userId;

    /**
     * 用户名
     */
    @TableField("user_name")
    private String userName;

    /**
     * 用户密码
     */
    @TableField("user_pwd")
    private String userPwd;

    /**
     * 性别:1为男，0为女
     */
    @TableField("sex")
    private Integer sex;

    /**
     * 邮箱
     */
    @TableField("user_email")
    private String userEmail;

    /**
     * 手机
     */
    @TableField("user_phone")
    private String userPhone;

    /**
     * 生日
     */
    @TableField("user_birthday")
    private LocalDate userBirthday;

    /**
     * 注册时间
     */
    @TableField("regist_time")
    private LocalDate registTime;

    /**
     * 角色ID
     */
    @TableField("role_id")
    private String roleId;

    /**
     * 逻辑删除列名  0为 未删除  1未删除
     */
    @TableField("deleted")
    private Integer deleted;


}
