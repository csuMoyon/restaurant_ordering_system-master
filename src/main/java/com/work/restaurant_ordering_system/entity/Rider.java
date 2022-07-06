package com.work.restaurant_ordering_system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 *
 */
@TableName(value = "rider")
@Data
public class Rider {
    /**
     *
     */
    private int id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String phone;
}
