package com.work.restaurant_ordering_system;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.github.yitter.contract.IdGeneratorOptions;
import com.github.yitter.idgen.YitIdHelper;
import com.work.restaurant_ordering_system.Util.Util;
import com.work.restaurant_ordering_system.common.CommonResponse;
import com.work.restaurant_ordering_system.entity.*;
import com.work.restaurant_ordering_system.persistence.*;
import com.work.restaurant_ordering_system.service.impl.ServeServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static com.github.yitter.idgen.YitIdHelper.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class RestaurantOrderingSystemApplicationTests {

    @Autowired
    OrderMapper orderMapper;
    @Autowired
    RiderMapper riderMapper;
    @Autowired
    CartMapper cartMapper;
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    FoodMapper foodMapper;
    @Autowired
    FoodTypeMapper foodTypeMapper;
    @Autowired
    NoticeMapper noticeMapper;
    @Autowired
    OrderOutMapper orderOutMapper;
    @Autowired
    UserMapper userMapper;

    @Autowired
    ServeServiceImpl serveService;

    @Test
    void utilTest()
    {
        String s = "123,456";
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("789");
        System.out.println(Util.stringToList(s));
        System.out.println(Util.listToString(list));
    }

    @Test
    void contextLoads() {

//        //修改值
//        Order order = new Order();
//        order.setOrderid(3);
//        order.setAllfood("qwer");
//        order.setComment("qwer");
//        order.setCheck("qwer");
//        order.setTable("12");
//        order.setTime(new Timestamp(1-10-10));
//        //修改条件s
//        UpdateWrapper<Order> orderUpdateWrapper = new UpdateWrapper<>();
//        orderUpdateWrapper.eq("userid", "1");
//        int update = orderMapper.update(order, orderUpdateWrapper);
//        System.out.println(update);

//        List<Rider> orderList = riderMapper.selectList(null);
//        System.out.println(orderList);

//        List<Order> orderList = orderMapper.selectList(null);
//        System.out.println(orderList);
//
//        List<Cart> cartList = cartMapper.selectList(null);
//        System.out.println(cartList);
//
//        List<Customer> customerList = customerMapper.selectList(null);
//        System.out.println(customerList);
//
//        List<Food> foodList = foodMapper.selectList(null);
//        System.out.println(foodList);
//
//        List<FoodType> foodTypeList = foodTypeMapper.selectList(null);
//        System.out.println(foodTypeList);
//
//        List<Notice> noticeList = noticeMapper.selectList(null);
//        System.out.println(noticeList);
//
//        List<OrderOut> orderOutList = orderOutMapper.selectList(null);
//        System.out.println(orderOutList);
//
//        List<User> userList = userMapper.selectList(null);
//        System.out.println(userList);
    }

    @Test
    public void testIdgenerator()
    {
        IdGeneratorOptions options = new IdGeneratorOptions((short) 1);
        options.WorkerIdBitLength = 10;
        setIdGenerator(options);

        long newId = nextId();
        System.out.println(newId);
    }

    @Test
    public void testServe()
    {
        ModifyPassword modifyPassword = new ModifyPassword();
        modifyPassword.setUserId("1");
        modifyPassword.setOldPassword("1234");
        modifyPassword.setNewPasswrod("12");
        serveService.modifyPassword(modifyPassword);
        System.out.println("------------------------------------------------");
        System.out.println(serveService.modifyPassword(modifyPassword).getMsg());
//        User user = new User();
//        user.setPassword("123");
//        user.setCharactor("12");
//        user.setPhone("12");
//        user.setUserid("1");
//        Long newId = nextId();
//        user.setId(newId.intValue());
//        CommonResponse<User>tem1= serveService.register(user);
//        System.out.println(tem1);
    }
}




//        Order order = new Order();
//        order.setOrderid(3);
//        order.setAllfood("qwer");
//        order.setComment("qwer");
//        order.setCheck("qwer");
//        order.setTable("12");
//        order.setTime(new Date(1));
//        //List<Order> result = orderMapper.selectList(null);
//        QueryWrapper queryWrapper=new QueryWrapper();
//        queryWrapper.eq("userid",1);
//        int tem= orderMapper.update(order,queryWrapper);
//        System.out.println(tem);