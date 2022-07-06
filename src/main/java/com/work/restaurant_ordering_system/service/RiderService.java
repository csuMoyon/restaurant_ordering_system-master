package com.work.restaurant_ordering_system.service;

import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.entity.OrderOut;

import java.util.List;

public interface RiderService {
    CommonResponse<List<OrderOut>> viewOrderOut();
}
