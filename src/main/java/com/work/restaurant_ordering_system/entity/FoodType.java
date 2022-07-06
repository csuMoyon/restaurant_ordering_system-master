package com.work.restaurant_ordering_system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @TableName foodtype
 */
@TableName(value ="foodtype")
@Data
public class FoodType implements Serializable {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     *
     */
    private String text;

    /**
     *
     */
    private String type;

    /**
     *
     */
    private byte[] img;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}