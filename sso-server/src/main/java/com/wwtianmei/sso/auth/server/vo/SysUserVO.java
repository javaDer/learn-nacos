package com.wwtianmei.sso.auth.server.vo;

import com.wwtianmei.sso.auth.server.entity.SysUser;
import lombok.Data;

import java.util.List;

/**
 * @author zhaofa
 * @title: SysUserVO
 * @date 2019-07-18 18:59
 */
@Data
public class SysUserVO extends SysUser {

    /**
     * 权限列表
     */
    private List<String> authorityList;
}
