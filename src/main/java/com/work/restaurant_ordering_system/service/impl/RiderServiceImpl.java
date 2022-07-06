package com.work.restaurant_ordering_system.service.impl;

import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.entity.OrderOut;
import com.work.restaurant_ordering_system.persistence.OrderOutMapper;
import com.work.restaurant_ordering_system.persistence.RiderMapper;
import com.work.restaurant_ordering_system.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {
    @Autowired
    RiderMapper riderMapper;
    @Autowired
    OrderOutMapper orderOutMapper;

    public CommonResponse<List<OrderOut>> viewOrderOut()
    {
        List<OrderOut> orderOutList = orderOutMapper.selectList(null);
        if(orderOutList.isEmpty())
        {
            return CommonResponse.createForError("view order out fail");
        }
        return CommonResponse.createForSuccess("view order out success",orderOutList);
    }
}
