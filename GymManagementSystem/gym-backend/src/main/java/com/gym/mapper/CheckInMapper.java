package com.gym.mapper;

import com.gym.entity.CheckIn;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 签到 仓库类

 */
@Mapper
@Repository
public interface CheckInMapper {

    int addCheckIn(CheckIn checkIn);

    CheckIn getCheckByMemberNo(CheckIn checkIn);

}
