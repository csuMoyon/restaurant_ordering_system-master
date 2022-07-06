package com.work.restaurant_ordering_system.controller;

import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.entity.Notice;
import com.work.restaurant_ordering_system.entity.Order;
import com.work.restaurant_ordering_system.service.impl.CommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 通用工具类controller
 */
@RestController
@RequestMapping("/common")
public class Common {
    @Autowired
    CommonServiceImpl commonService;

    @GetMapping(value = "/viewOrder")
    public CommonResponse<List<Order>> getOrderAll()
    {
        return commonService.viewOrder();
    }

    @GetMapping(value = "/viewNotice")
    public CommonResponse<List<Notice>> getNoticeAll()
    {
        return commonService.viewNotice();
    }
}
