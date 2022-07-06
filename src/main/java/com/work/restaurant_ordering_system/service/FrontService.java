package com.work.restaurant_ordering_system.service;

import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.entity.Notice;
import com.work.restaurant_ordering_system.entity.Order;
import com.work.restaurant_ordering_system.entity.User;
import org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter;

import java.sql.Date;
import java.util.List;

public interface FrontService {
    CommonResponse<User> modifyUser(User user);

    CommonResponse<List<Order>> viewOrder(Date time1, Date time2);

    CommonResponse<String> addUser(User user);

    CommonResponse<String> deleteUser(User user);

    CommonResponse<User> selectUser(String userId);

    CommonResponse<Notice> addNotice(Notice notice);

//    CommonResponse<>
}

