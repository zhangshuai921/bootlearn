package com.boot.security.service;

import com.boot.security.model.UmsAdmin;
import com.boot.security.model.UmsPermission;

import java.util.List;

public interface UmsAdminService {


    UmsAdmin getAdminByUsername(String username);

    List<UmsPermission> getPermissionList(Long id);

    UmsAdmin register(UmsAdmin umsAdminParam);

    String login(String username, String password);
}
