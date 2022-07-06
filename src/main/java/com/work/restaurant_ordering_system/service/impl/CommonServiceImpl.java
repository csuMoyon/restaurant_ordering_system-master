package com.work.restaurant_ordering_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.controller.Common;
import com.work.restaurant_ordering_system.entity.ModifyPassword;
import com.work.restaurant_ordering_system.entity.Notice;
import com.work.restaurant_ordering_system.entity.Order;
import com.work.restaurant_ordering_system.persistence.NoticeMapper;
import com.work.restaurant_ordering_system.persistence.OrderMapper;
import com.work.restaurant_ordering_system.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonServiceImpl implements CommonService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    NoticeMapper noticeMapper;

    public CommonResponse<List<Order>> viewOrder()
    {
        List<Order> result = orderMapper.selectList(null);
        if(result.isEmpty())
        {
            return CommonResponse.createForError("view order failed");

        }
        return CommonResponse.createForSuccess("view order success",result);
    }

    public CommonResponse<List<Notice>> viewNotice()
    {
        List<Notice> result = noticeMapper.selectList(null);
        if(result.isEmpty())
        {
            return CommonResponse.createForError("view notice failed");
        }
        return CommonResponse.createForSuccess("view notice success",result);
    }
}
