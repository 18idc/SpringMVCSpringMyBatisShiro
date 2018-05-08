package com.q18idc.ssms.mapper;

import com.q18idc.ssms.entity.User;
import com.q18idc.ssms.utils.MyMapper;
import org.apache.ibatis.annotations.CacheNamespaceRef;
import org.springframework.stereotype.Repository;

@Repository
@CacheNamespaceRef(UserMapper.class)
public interface UserMapper extends MyMapper<User> {
}