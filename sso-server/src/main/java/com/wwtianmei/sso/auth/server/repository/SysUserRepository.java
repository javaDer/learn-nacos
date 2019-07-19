package com.wwtianmei.sso.auth.server.repository;

import com.wwtianmei.sso.auth.server.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author zhaofa
 * @title: SysUserRepository
 * @date 2019-07-18 18:53
 */
public interface SysUserRepository extends JpaSpecificationExecutor<SysUser>, JpaRepository<SysUser, Integer> {

    SysUser findByUsername(String username);
}
