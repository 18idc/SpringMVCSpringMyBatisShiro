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

@Table(name = "tb_role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role extends Condition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色名
     */
    private String name;

    /**
     * 是否可用 1可用 0禁用
     */
    private Integer available;

    /**
     * 是否删除 1删除 0显示
     */
    private Integer delete;

}