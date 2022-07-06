package com.work.restaurant_ordering_system.persistence;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.work.restaurant_ordering_system.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
