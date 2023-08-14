package com.xinye.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import com.xinye.entity.UserInfo;

/**
 * 学生信息表(UserInfo)表数据库访问层
 *
 * @author zsq
 * @since 2023-08-14 14:07:58
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}

