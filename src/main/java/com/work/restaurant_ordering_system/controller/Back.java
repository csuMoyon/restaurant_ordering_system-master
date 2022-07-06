package com.work.restaurant_ordering_system.controller;

import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.entity.*;
import com.work.restaurant_ordering_system.service.impl.BackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后厨controller
 */
@RestController
@RequestMapping("/back")
public class Back {
    @Autowired
    BackServiceImpl backService;

    @GetMapping(value = "/viewOrder")
    public CommonResponse<List<Order>> getOrderAll()
    {
        return backService.viewOrder();
    }

    @PostMapping(value = "/submitOrder")
    public CommonResponse<Order> submitOrder(@RequestParam Order order)
    {
        return backService.submitOrder(order);
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
