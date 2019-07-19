package com.wwtianmei.sso.auth.server.service.impl;

import com.wwtianmei.sso.auth.server.entity.SysUser;
import com.wwtianmei.sso.auth.server.repository.SysUserRepository;
import com.wwtianmei.sso.auth.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaofa
 * @title: UserServiceImpl
 * @date 2019-07-18 18:58
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public SysUser getByUsername(String username) {
        return sysUserRepository.findByUsername(username);
    }
}
