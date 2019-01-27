package com.weweb.user.service;

import com.weweb.api.user.UserService;
import com.weweb.user.entity.User;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService
{
    @Override
    public List<User> findAllUsers() {
        return Arrays.asList(new User(1L,"zhang1"),new User(2L,"zhang2"));
    }
}
