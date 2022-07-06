package com.work.restaurant_ordering_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.work.restaurant_ordering_system.Util.Util;
import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.controller.Common;
import com.work.restaurant_ordering_system.entity.*;
import com.work.restaurant_ordering_system.persistence.NoticeMapper;
import com.work.restaurant_ordering_system.persistence.OrderMapper;
import com.work.restaurant_ordering_system.persistence.OrderOutMapper;
import com.work.restaurant_ordering_system.persistence.UserMapper;
import com.work.restaurant_ordering_system.service.BackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackServiceImpl implements BackService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    OrderOutMapper orderOutMapper;
    @Autowired
    NoticeMapper noticeMapper;

    public CommonResponse<List<Order>> viewOrder()
    {
        QueryWrapper<Order> queryWrapper = new QueryWrapper();
        List<Order> result = orderMapper.selectList(null);
        if(result.isEmpty())
        {
            return CommonResponse.createForError("view order failed");

        }
        return CommonResponse.createForSuccess("view order success",result);
    }

    public CommonResponse<Order> submitOrder(Order order)
    {
        int result = orderMapper.insert(order);
        if(result==0)
        {
            return CommonResponse.createForError("add order failed");
        }
        return CommonResponse.createForSuccess("add order success",order);
    }

    public CommonResponse<String> modifyPassword(ModifyPassword modifyPassword)
    {
        String getUserId = modifyPassword.getUserId();
        String getPassword = modifyPassword.getOldPassword();
        String getNewPassword = modifyPassword.getNewPasswrod();
        User user = userMapper.selectById(getUserId);
        if(user==null)
        {
            return CommonResponse.createForError("user not exist");
        }
        else if(user.getCharactor().equals("front")||user.getCharactor().equals("serve"))
        {
            return CommonResponse.createForError("wrong charactor");
        }
        else
        {
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("userid",getUserId).eq("password",getPassword);
            if(user.getPassword().equals(getPassword))
            {
                user.setPassword(getNewPassword);
                userMapper.update(user,queryWrapper);
                return CommonResponse.createForSuccess("modify success");
            }
            else
            {
                return CommonResponse.createForError("wrong password");
            }
        }
    }

    public CommonResponse<List<OrderOut>> viewOrderOut()
    {
        List<OrderOut>result = orderOutMapper.selectList(null);
        if(result.isEmpty())
        {
            return CommonResponse.createForError("no orderOut get");
        }
        else
        {
            return CommonResponse.createForSuccess("view orderOut success",result);
        }
    }

    public CommonResponse<List<Dinner>> viewDinner()
    {
        List<Dinner> result = Util.dinnerList;
        if(result.isEmpty())
        {
            return CommonResponse.createForError("no dinner get");
        }
        else
        {
            return CommonResponse.createForSuccess("get dinner list",result);
        }
    }

    public CommonResponse<String> modifyOrderOut(int orderOutId)
    {
        OrderOut orderOut = orderOutMapper.selectById(orderOutId);
        if(orderOut.equals(null))
        {
            return CommonResponse.createForError("no such orderOut");
        }
        else if(orderOut.getOrderoutcheck().equals("11")||orderOut.getOrderoutcheck().equals("10"))
        {
            return CommonResponse.createForError("orderOut has been completed");
        }
        else
        {
            orderOut.setOrderoutcheck("10");
            UpdateWrapper updateWrapper = new UpdateWrapper();
            updateWrapper.eq("orderid",orderOutId);
            int tem = orderOutMapper.update(orderOut, updateWrapper);
            return CommonResponse.createForSuccess("modify order out success");
        }
    }

    public CommonResponse<String> modifyDinner(int dinnerId,int foodInUseId)
    {
        for(int i=0;i<Util.dinnerList.size();i++)
        {
            if(Util.dinnerList.get(i).getId()==dinnerId)
            {
                for(int j=0;j<Util.dinnerList.get(i).getFoodInUseList().size();j++)
                {
                    if(Util.dinnerList.get(i).getFoodInUseList().get(j).getId()==foodInUseId)
                    {
                        Util.dinnerList.get(i).getFoodInUseList().get(j).setIfCompleted("true");
                        return CommonResponse.createForSuccess("modify dinner success");
                    }
                }
            }
        }
        return CommonResponse.createForError("modify dinner fail");
    }

    public CommonResponse<Notice> submitNotice(Notice notice)
    {
        Notice tem = noticeMapper.selectById(notice.getNoticeid());
        if(tem!=null)
        {
            return CommonResponse.createForError("such notice has been create");
        }
        else
        {
            int tem0 = noticeMapper.insert(notice);
            return CommonResponse.createForSuccess("notice has been create success",notice);
        }
    }

}
