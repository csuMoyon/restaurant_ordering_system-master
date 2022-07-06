package com.work.restaurant_ordering_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.work.restaurant_ordering_system.Util.Util;
import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.controller.Common;
import com.work.restaurant_ordering_system.entity.*;
import com.work.restaurant_ordering_system.persistence.FoodMapper;
import com.work.restaurant_ordering_system.persistence.OrderMapper;
import com.work.restaurant_ordering_system.persistence.UserMapper;
import com.work.restaurant_ordering_system.service.ServeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServeServiceImpl implements ServeService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    FoodMapper foodMapper;

    public CommonResponse<String> modifyPassword(ModifyPassword modifyPassword)
    {
        String getUserId = modifyPassword.getUserId();
        String getPassword = modifyPassword.getOldPassword();
        String getNewPassword = modifyPassword.getNewPasswrod();
        QueryWrapper<User> queryWrapper0 = new QueryWrapper();
        queryWrapper0.eq("userid",getUserId);
        User user = userMapper.selectOne(queryWrapper0);
        if(user==null)
        {
            return CommonResponse.createForError("user not exist");
        }
        else if(user.getCharactor().equals("front")||user.getCharactor().equals("back"))
        {
            return CommonResponse.createForError("wrong charactor");
        }
        else
        {
            if(!user.getPassword().equals(getPassword))
            {
                return CommonResponse.createForError("wrong password");
            }
            else
            {
                user.setPassword(getNewPassword);
                userMapper.update(user,queryWrapper0);
                return CommonResponse.createForSuccess("modify success");
            }
        }
    }

    public CommonResponse<User> register(User user)
    {
        User user1 = userMapper.selectById(user.getId());
        if(user1!=null)
        {
            return CommonResponse.createForError("user has been exist");
        }
        else
        {
            userMapper.insert(user);
            return CommonResponse.createForSuccess("register success",user);
        }
    }

    public CommonResponse<Order> submitOrder(Order order)
    {
        Order order1 = orderMapper.selectById(order.getOrderid());
        if(order1==null)
        {
            return CommonResponse.createForError("submit error,id has been exist");
        }
        else
        {
            orderMapper.insert(order);
            return CommonResponse.createForSuccess("submit order success",order);
        }
    }

    public CommonResponse<Dinner> submitDinner(Dinner dinner)
    {
        Util.dinnerList.add(dinner);
        return CommonResponse.createForSuccess("submit dinner success",dinner);
    }

    public CommonResponse<List<Food>> viewFood()
    {
        List<Food> result = foodMapper.selectList(null);
        return CommonResponse.createForSuccess("view food success",result);
    }
}
