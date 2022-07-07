package com.work.restaurant_ordering_system.service;

import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.entity.*;
import org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter;

import java.sql.Date;
import java.util.List;
import java.util.ArrayList;

public interface FrontService {

    CommonResponse<List<Order>> viewOrder(Date time1, Date time2);

    CommonResponse<List<User>> viewUser();

    CommonResponse<String> modifyUser(String userId,String password,String character);

    CommonResponse<User> addUser(String useId,String password,String character);

    CommonResponse<User> deleteUser(String useId);

    CommonResponse<User> viewOneUser(String useId);

    CommonResponse<List<Notice>> viewNotice();

    CommonResponse<Notice> addNotice(String adminId,String text);

    CommonResponse<String> modifyPassword(ModifyPassword modify);

    CommonResponse<String> confirm(String orderId);

    CommonResponse<List<Food>> viewFood();

    CommonResponse<Food> addFood(String name,String text,String price,img img);

    CommonResponse<Food> deleteFood(String name);

    CommonResponse<String> modifyFood(String text,String price);

    CommonResponse<Food> viewOneFood(String name);

    CommonResponse<String> viewEvaluation();
//    CommonResponse<>
}

