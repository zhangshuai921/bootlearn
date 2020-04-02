package com.boot.security.mapper;

import com.boot.security.model.UmsPermission;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UmsAdminRoleRelationDao {

    List<UmsPermission> getPermissionList(Long adminId);
}
