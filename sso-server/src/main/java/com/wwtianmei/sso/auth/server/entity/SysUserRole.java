package com.wwtianmei.sso.auth.server.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author zhaofa
 * @title: SysUserRole
 * @date 2019-07-18 18:49
 */
@Data
@Entity
@Table(schema = "permission", name = "sys_user_role")
public class SysUserRole implements Serializable {
    private static final long serialVersionUID = -1810195806444298544L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "role_id")
    private Integer roleId;
}
