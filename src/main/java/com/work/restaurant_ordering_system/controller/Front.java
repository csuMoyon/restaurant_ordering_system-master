package com.work.restaurant_ordering_system.controller;

import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.entity.*;
import com.work.restaurant_ordering_system.service.impl.FrontServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * 前台管理系统controller
 */
@RestController
@RequestMapping("/front")
public class Front {
    @Autowired
    FrontServiceImpl frontService;


    @PostMapping(value = "/viewOrder")
    public CommonResponse<List<Order>> viewOrder(Date time1, Date time2)
    {
        return frontService.viewOrder(time1, time2);
    }

    @PostMapping(value = "/viewUser")
    CommonResponse<List<User>> viewUser()
    {
        return frontService.viewUser();
    }

    @PostMapping(value = "/modifyUser")
    CommonResponse<String> modifyUser(String userId,String password,String character)
    {
        return frontService.modifyUser(userId, password, character);
    }

    @PostMapping(value = "/addUser")
    CommonResponse<User> addUser(String useId,String password,String character)
    {
        return frontService.addUser(useId, password, character);
    }

    @PostMapping(value = "/deleteUser")
    CommonResponse<User> deleteUser(String useId)
    {
        return frontService.deleteUser(useId);
    }

    @PostMapping(value = "/viewOneUser")
    CommonResponse<User> viewOneUser(String useId)
    {
        return frontService.viewOneUser(useId);
    }

    @PostMapping(value = "/viewNotice")
    CommonResponse<List<Notice>> viewNotice()
    {
        return frontService.viewNotice();
    }

    @PostMapping(value = "/addNotice")
    CommonResponse<Notice> addNotice(String adminId,String text)
    {
        return frontService.addNotice(adminId, text);
    }

    @PostMapping(value = "/modifyPassword")
    CommonResponse<String> modifyPassword(ModifyPassword modify)
    {
        return frontService.modifyPassword(modify);
    }

    @PostMapping(value = "/confirm")
    CommonResponse<String> confirm(String orderId)
    {
        return frontService.confirm(orderId);
    }

    @PostMapping(value = "/viewFood")
    CommonResponse<List<Food>> viewFood()
    {
        return frontService.viewFood();
    }

    @PostMapping(value = "/addFood")
    CommonResponse<Food> addFood(String name,String text,String price,img img)
    {
        return frontService.addFood(name, text, price, img);
    }

    @PostMapping(value = "/deleteFood")
    CommonResponse<Food> deleteFood(String name)
    {
        return frontService.deleteFood(name);
    }

    @PostMapping(value = "/modifyFood")
    CommonResponse<String> modifyFood(String text,String price)
    {
        return frontService.modifyFood(text, price);
    }

    @PostMapping(value = "/viewOneFood")
    CommonResponse<Food> viewOneFood(String name)
    {
        return frontService.viewOneFood(name);
    }

    @PostMapping(value = "/viewEvaluation")
    CommonResponse<String> viewEvaluation()
    {
        return frontService.viewEvaluation();
    }
}
