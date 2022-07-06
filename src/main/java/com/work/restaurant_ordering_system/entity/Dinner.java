package com.work.restaurant_ordering_system.entity;

import lombok.Data;

import java.util.List;

@Data
/**
 *用餐会话，用于在堂食过程中进行实时加菜，查看制作情况
 */
public class Dinner {
    private int id;

    private int table;

    private List<Customer> customerList;

    private List<FoodInUse> foodInUseList;

    private int totalPrice;

}