package com.q18idc.ssms.mapper;

import com.q18idc.ssms.entity.UserRole;
import com.q18idc.ssms.utils.MyMapper;
import org.apache.ibatis.annotations.CacheNamespaceRef;
import org.springframework.stereotype.Repository;

@Repository
@CacheNamespaceRef(UserRoleMapper.class)
public interface UserRoleMapper extends MyMapper<UserRole> {
}