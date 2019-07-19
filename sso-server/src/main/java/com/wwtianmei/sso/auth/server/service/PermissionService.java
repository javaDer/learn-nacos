package com.wwtianmei.sso.auth.server.service;

import com.wwtianmei.sso.auth.server.entity.SysPermission;

import java.util.List;

/**
 * @author zhaofa
 * @title: PermissionService
 * @date 2019-07-18 18:56
 */
public interface PermissionService {

    List<SysPermission> findByUserId(Integer userId);
}
