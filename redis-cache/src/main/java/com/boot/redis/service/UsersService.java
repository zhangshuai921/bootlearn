package com.boot.redis.service;

import com.boot.redis.entity.Users;

import java.util.List;

public interface UsersService {
    List<Users> all();

    Users getone(int i);

    Users updateone(int i);

    void delone(int i);
}
