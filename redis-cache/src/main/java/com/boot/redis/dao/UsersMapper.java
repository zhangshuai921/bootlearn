package com.boot.redis.dao;

import com.boot.redis.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersMapper {
    List<Users> all();

    Users getone(int i);

    void updateone(Users users);

    void delone(int i);
}
