package com.work.restaurant_ordering_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.entity.*;
import com.work.restaurant_ordering_system.persistence.*;
import com.work.restaurant_ordering_system.service.FrontService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class FrontServiceImpl implements FrontService {

    @Autowired
    CartMapper cartMapper;
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    FoodMapper foodMapper;
    @Autowired
    NoticeMapper noticeMapper;
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    RiderMapper riderMapper;
    @Autowired
    UserMapper userMapper;


    public CommonResponse<List<Order>> viewOrder(Date time1, Date time2)//时间还未用上，内容和后厨查看菜单一样
    {
        QueryWrapper<Order> queryWrapper = new QueryWrapper();
        List<Order> result = orderMapper.selectList(null);
        if(result.isEmpty())
        {
            return CommonResponse.createForError("view order failed");

        }
        return CommonResponse.createForSuccess("view order success",result);
    }

    public CommonResponse<List<User>> viewUser()//按照后厨的查看方式，将ArrayList改为了List
    {
        List<User>result = userMapper.selectList(null);
        if(result.isEmpty())
        {
            return CommonResponse.createForError("no User get");
        }
        else
        {
            return CommonResponse.createForSuccess("view User success",result);
        }
    }

    public CommonResponse<String> modifyUser(String userId,String password,String character)
    {

    }

    public CommonResponse<User> addUser(String useId,String password,String character)
    {

    }

    public CommonResponse<User> deleteUser(String useId)
    {

    }

    public CommonResponse<User> viewOneUser(String useId)
    {
        User user = userMapper.selectById(useId);
        if(user.equals(null))
        {
            return CommonResponse.createForError("no such User");
        }
        else
        {
            return CommonResponse.createForSuccess("view such User success",user);
        }
    }

    public CommonResponse<List<Notice>> viewNotice()//和viewUser同样思路
    {
        List<Notice>result = noticeMapper.selectList(null);
        if(result.isEmpty())
        {
            return CommonResponse.createForError("no Notice get");
        }
        else
        {
            return CommonResponse.createForSuccess("view Notice List success",result);
        }
    }

    public CommonResponse<Notice> addNotice(String adminId,String text)
    {

    }

    public CommonResponse<String> modifyPassword(ModifyPassword modify)
    {

    }

    public CommonResponse<String> confirm(String orderId)
    {

    }

    public CommonResponse<List<Food>> viewFood()//和viewUser同样思路
    {
        List<Food>result = foodMapper.selectList(null);
        if(result.isEmpty())
        {
            return CommonResponse.createForError("no Food get");
        }
        else
        {
            return CommonResponse.createForSuccess("view Food List success",result);
        }
    }

    public CommonResponse<Food> addFood(String name,String text,String price,img img)
    {

    }

    public CommonResponse<Food> deleteFood(String name)
    {

    }

    public CommonResponse<String> modifyFood(String text,String price)
    {

    }

    public CommonResponse<Food> viewOneFood(String name)//和viewOneUser同样思路
    {
        Food food = foodMapper.selectById(name);
        if(food.equals(null))
        {
            return CommonResponse.createForError("no such Food");
        }
        else
        {
            return CommonResponse.createForSuccess("view such Food success",food);
        }
    }

    public CommonResponse<String> viewEvaluation()
    {

    }
}
