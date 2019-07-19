package com.wwtianmei.sso.auth.server.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author zhaofa
 * @title: SysRolePermission
 * @date 2019-07-18 18:48
 */
@Data
@Entity
@Table(schema = "permission", name = "sys_role_permission")
public class SysRolePermission implements Serializable {
    private static final long serialVersionUID = 7402412601579098788L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "permission_id")
    private Integer permissionId;
}
