package com.work.restaurant_ordering_system.controller;

import com.github.yitter.idgen.YitIdHelper;
import com.work.restaurant_ordering_system.Util.Util;
import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.entity.*;
import com.work.restaurant_ordering_system.service.impl.ServeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * 服务员controller
 */
@RestController
@RequestMapping("/serve")
public class Serve {
    @Autowired
    ServeServiceImpl  serveService;

    @PutMapping(value = "/modifyPassword")
    public CommonResponse<String> modifyPassword(@RequestParam ModifyPassword modifyPassword)
    {
        return serveService.modifyPassword(modifyPassword);
    }

    @PostMapping(value = "/register")
    public CommonResponse<User>register(@RequestParam String chara,@RequestParam String userid,@RequestParam String password,@RequestParam String phone)
    {
        User user = new User();
        user.setPassword(password);
        user.setCharactor(chara);
        user.setPhone(phone);
        user.setUserid(userid);

        long newId = YitIdHelper.nextId();
        user.setId((int)newId);
        return serveService.register(user);
    }

    @PostMapping(value = "submitOrder")
    public CommonResponse<Order>submitOrder(@RequestParam String tableid,@RequestParam String allFood,@RequestParam String orderComment,@RequestParam String orderCheck)
    {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Order order = new Order();
        long newId = YitIdHelper.nextId();
        order.setOrderid((int)newId);
        order.setAllfood(allFood);
        order.setOrdertime(timestamp);
        order.setOrdercheck(orderCheck);
        order.setOrdercomment(orderComment);
        order.setTableid(tableid);

        return serveService.submitOrder(order);
    }

    @PostMapping(value = "submitDinner")
    public CommonResponse<Dinner> submitDinner(@RequestParam String tableid,@RequestParam List<FoodInUse> foodInUse,@RequestParam String totalPrice)
    {
        Dinner dinner = new Dinner();
        Long temId = YitIdHelper.nextId();
        dinner.setId(temId.intValue());
        dinner.setCustomerList(null);
        dinner.setTable(Integer.parseInt(tableid));
        dinner.setFoodInUseList(foodInUse);
        dinner.setTotalPrice(Integer.parseInt(totalPrice));
        return serveService.submitDinner(dinner);
    }

    @GetMapping(value = "viewFood")
    public CommonResponse<List<Food>> viewFood()
    {
        return serveService.viewFood();
    }


}
