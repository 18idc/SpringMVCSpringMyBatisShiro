package com.q18idc.ssms.mapper;

import com.q18idc.ssms.entity.RolePermission;
import com.q18idc.ssms.utils.MyMapper;
import org.apache.ibatis.annotations.CacheNamespaceRef;
import org.springframework.stereotype.Repository;

@Repository
@CacheNamespaceRef(RolePermissionMapper.class)
public interface RolePermissionMapper extends MyMapper<RolePermission> {
}