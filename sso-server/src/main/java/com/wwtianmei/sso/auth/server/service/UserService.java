package com.wwtianmei.sso.auth.server.service;

import com.wwtianmei.sso.auth.server.entity.SysUser;

/**
 * @author zhaofa
 * @title: UserService
 * @date 2019-07-18 18:56
 */
public interface UserService {
    SysUser getByUsername(String username);
}
