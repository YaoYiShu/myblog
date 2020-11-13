package com.yys.service;

import com.yys.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
