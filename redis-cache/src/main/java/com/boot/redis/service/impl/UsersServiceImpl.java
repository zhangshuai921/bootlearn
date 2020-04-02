package com.boot.redis.service.impl;

import com.boot.redis.dao.UsersMapper;
import com.boot.redis.entity.Users;
import com.boot.redis.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springboot-demo
 * @description:
 * @author: zhangshuai
 * @create: 2020-03-26 16:07
 **/
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    @Cacheable(value = "userList",keyGenerator = "keyGenerator")
    public List<Users> all() {
        return usersMapper.all();
    }

    @Override
    @Cacheable(value = "users",key = "#p0")
    public Users getone(int i) {
        return usersMapper.getone(i);
    }

    @Override
    @CachePut(value = "users",key = "#p0")
    public Users updateone(int i) {

        Users users = new Users();
        users.setUserName("sss");
        users.setId(i);
        usersMapper.updateone(users);

        return usersMapper.getone(i);
    }

    @Override
    @CacheEvict(value = "users",key = "#p0")
    public void delone(int i) {
        usersMapper.delone(i);
    }
}
