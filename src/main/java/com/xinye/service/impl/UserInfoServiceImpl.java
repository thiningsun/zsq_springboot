package com.xinye.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinye.mapper.UserInfoMapper;
import com.xinye.entity.UserInfo;
import com.xinye.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * 学生信息表(UserInfo)表服务实现类
 *
 * @author zsq
 * @since 2023-08-14 14:07:58
 */
@Service("userInfoService")
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}

