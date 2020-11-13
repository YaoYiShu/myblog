package com.yys.service;

import com.yys.dao.UserRepository;
import com.yys.po.User;
import com.yys.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//接口实现
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

// 查询数据库是否存在用户，没有则返回空
    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
