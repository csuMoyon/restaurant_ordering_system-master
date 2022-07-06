package com.work.restaurant_ordering_system.persistence;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.work.restaurant_ordering_system.entity.Food;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodMapper extends BaseMapper<Food> {
}
