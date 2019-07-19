package com.wwtianmei.sso.auth.server.domain;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * @author zhaofa
 * @title: MyUser
 * @date 2019-07-18 18:44
 */
@Data
public class MyUser extends User {
    /**
     * 举个例子，部门ID
     */

    private Integer departmentId;
    /**
     * 举个例子，假设我们想增加一个字段，这里我们增加一个mobile表示手机号
     */
    private String mobile;

    public MyUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public MyUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }
}
