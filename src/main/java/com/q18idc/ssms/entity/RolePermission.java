package com.q18idc.ssms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author q18idc.com QQ993143799
 */

@Table(name = "tb_role_permission")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolePermission extends Condition{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色id
     */
    private Integer roleid;

    /**
     * 权限id
     */
    private Integer perid;

}