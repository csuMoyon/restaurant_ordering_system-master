package com.work.restaurant_ordering_system.service;

import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.controller.Common;
import com.work.restaurant_ordering_system.entity.*;

import java.util.List;

public interface ServeService {
    CommonResponse<String> modifyPassword(ModifyPassword modifyPassword);
    CommonResponse<User> register(User user);
    CommonResponse<Order> submitOrder(Order order);
    CommonResponse<Dinner> submitDinner(Dinner dinner);
    CommonResponse<List<Food>> viewFood();
}
