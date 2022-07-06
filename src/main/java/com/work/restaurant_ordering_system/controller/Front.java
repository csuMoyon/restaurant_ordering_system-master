package com.work.restaurant_ordering_system.controller;

import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.entity.*;
import com.work.restaurant_ordering_system.service.impl.FrontServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

/**
 * 前台管理系统controller
 */
@RestController
@RequestMapping("/front")
public class Front {
    @Autowired
    FrontServiceImpl frontService;

    @GetMapping(value = "/modifyUser")
    public CommonResponse<User user> modifyUser()
    {
        return frontService.modifyUser();
    }

    @PostMapping(value = "/viewOrder")
    public CommonResponse<List<Order>> viewOrder(@RequestParam Date time1, Date time2)
    {
        return frontService.viewOrder(Date time1, Date time2);
    }

    @PostMapping(value = "/submitNotice")
    public CommonResponse<Notice> submitNotice(@RequestParam Notice notice)
    {
        return backService.submitNotice(notice);
    }

    @PostMapping(value = "/modifyPassword")
    public CommonResponse<String> modifyPassword(@RequestParam ModifyPassword modifyPassword)
    {
        return backService.modifyPassword(modifyPassword);
    }

    @GetMapping(value = "viewOrderOut")
    public CommonResponse<List<OrderOut>> getOrderOut()
    {
        return backService.viewOrderOut();
    }

    @GetMapping(value = "viewDinner")
    public CommonResponse<List<Dinner>>getDinner()
    {
        return backService.viewDinner();
    }

    @PutMapping(value = "modifyOrderOut/{orderOutId}")
    public CommonResponse<String> modifyOrderOut(@PathVariable int orderOutId)
    {
        return backService.modifyOrderOut(orderOutId);
    }

    @PutMapping(value = "modifyDinner/{dinnerId}/{foodInUseId}")
    public CommonResponse<String> modifyDinner(@PathVariable int dinnerId,@PathVariable int foodInUseId)
    {
        return backService.modifyDinner(dinnerId,foodInUseId);
    }
}
