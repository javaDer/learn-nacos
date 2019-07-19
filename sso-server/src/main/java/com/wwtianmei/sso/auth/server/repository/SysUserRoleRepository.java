package com.wwtianmei.sso.auth.server.repository;

import com.wwtianmei.sso.auth.server.entity.SysUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author zhaofa
 * @title: SysUserRoleRepository
 * @date 2019-07-18 18:53
 */
public interface SysUserRoleRepository extends JpaSpecificationExecutor<SysUserRole>, JpaRepository<SysUserRole, Integer> {

    List<SysUserRole> findByUserId(Integer userId);
}
