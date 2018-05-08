package com.q18idc.ssms.mapper;

import com.q18idc.ssms.entity.Role;
import com.q18idc.ssms.utils.MyMapper;
import org.apache.ibatis.annotations.CacheNamespaceRef;
import org.springframework.stereotype.Repository;

@Repository
@CacheNamespaceRef(RoleMapper.class)
public interface RoleMapper extends MyMapper<Role> {
}