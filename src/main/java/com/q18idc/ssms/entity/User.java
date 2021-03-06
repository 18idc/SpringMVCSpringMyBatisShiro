package com.q18idc.ssms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author q18idc.com QQ993143799
 */

@Table(name = "tb_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends Condition{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

    private String salt;

    private String phone;

    private String email;

    private String sex;

    private Date birthday;

}