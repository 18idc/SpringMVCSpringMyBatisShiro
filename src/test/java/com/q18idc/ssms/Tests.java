package com.q18idc.ssms;

import com.q18idc.ssms.entity.Permission;
import com.q18idc.ssms.service.SysService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author q18idc.com QQ993143799
 * @date 2018/5/8 14:41
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/*.xml"})
public class Tests {

    @Autowired
    private SysService sysService;

    @Test
    public void hehe(){
        List<Permission> menu = sysService.findMenuListByUserName("admin");
        for (Permission permission : menu) {
            System.out.println(permission);
        }
    }
}
