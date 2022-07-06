package com.work.restaurant_ordering_system.service;

import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.entity.ModifyPassword;
import com.work.restaurant_ordering_system.entity.Notice;
import com.work.restaurant_ordering_system.entity.Order;

import java.util.List;

public interface CommonService {
    CommonResponse<List<Order>> viewOrder();
    CommonResponse<List<Notice>> viewNotice();
}
