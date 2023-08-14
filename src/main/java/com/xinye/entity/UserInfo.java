package com.xinye.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * 学生信息表(UserInfo)表实体类
 *
 * @author zsq
 * @since 2023-08-14 14:07:57
 */
@Data
@EqualsAndHashCode(callSuper = true)
@SuppressWarnings("serial")
@TableName("user_info")
public class UserInfo extends Model<UserInfo> {
    @TableId(type = IdType.AUTO)
    //ID
    private Long id;
    //姓名
    private String name;
    //年龄
    private Long age;
    //技能
    private String skill;
    //评价
    private String evaluate;
    //分数
    private Long fraction;
}

