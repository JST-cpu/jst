package com.gym.mapper;

import com.gym.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 管理员 仓库类

 */
@Mapper
@Repository
public interface AdminMapper {

    Admin getAdminPassword(String adminAccount, String adminPassword);

}
