package com.work.restaurant_ordering_system.service;

import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.entity.*;

import java.util.List;

public interface BackService {
    CommonResponse<List<Order>> viewOrder();
    CommonResponse<Order> submitOrder(Order order);
    CommonResponse<String> modifyPassword(ModifyPassword modifyPassword);
    CommonResponse<List<OrderOut>> viewOrderOut();
    CommonResponse<List<Dinner>> viewDinner();
    CommonResponse<String> modifyOrderOut(int orderOutId);
    CommonResponse<String> modifyDinner(int dinnerId,int foodInUseId);
    CommonResponse<Notice> submitNotice(Notice notice);
}
