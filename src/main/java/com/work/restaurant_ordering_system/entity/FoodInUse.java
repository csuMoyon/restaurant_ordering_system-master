package com.work.restaurant_ordering_system.entity;

import lombok.Data;

/**
 *
 */
@Data
public class FoodInUse {
    /**
     *
     * 递增，用于在会话中唯一标识要做的一道菜
     */
    private int id;
    /**
     *对应food中的name
     */
    private String name;
    /**
     *食物是否制作完成
     */
    private String ifCompleted;

    public FoodInUse(int id,String name)
    {
        setId(id);
        setName(name);
        setIfCompleted("false");
    }
}
