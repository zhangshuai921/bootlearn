package com.boot.security.mapper;

import com.boot.security.model.UmsAdmin;
import com.boot.security.model.UmsAdminExample;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UmsAdminMapper {


    List<UmsAdmin> selectByExample(UmsAdminExample example);

    void insert(UmsAdmin umsAdmin);
}
