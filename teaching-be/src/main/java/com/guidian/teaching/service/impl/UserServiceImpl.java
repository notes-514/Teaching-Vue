package com.guidian.teaching.service.impl;

import com.guidian.teaching.entity.User;
import com.guidian.teaching.mapper.UserMapper;
import com.guidian.teaching.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Description 此服务实现类用于实现针对于tb_user表的常用操作
 * @author dhxstart
 * @date 2021/6/11 20:54
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
