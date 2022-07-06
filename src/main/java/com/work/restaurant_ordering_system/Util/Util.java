package com.work.restaurant_ordering_system.Util;

import com.work.restaurant_ordering_system.entity.Dinner;
import com.work.restaurant_ordering_system.entity.Notice;
import lombok.Data;

import java.util.List;

/**
 * 存储在内存中的，包括用餐会话列表，餐厅名称信息等
 */
@Data
public class Util {
    public static List<Dinner> dinnerList;
    public static String restaurtantName = "God Come On";
    public static int freeTable = 30;
    public static int dinnerNumber = 0;
    public static int orderOutNumber = 0;

    public static List<String> stringToList(String s)
    {
        return List.of(s.split(","));
    }

    public static String listToString(List<String> list)
    {
        String result = "";
        for(int i=0;i<list.size()-1;i++)
        {
            result+=list.get(i);
            result+=",";
        }
        result+=list.get(list.size()-1);
        return result;
    }


//    public List<Notice> viewNotice()
//    {
//
//    }
//
//    public void modifyPassword(String userId,String oldPassword,String newPassword)
//    {
//
//    }
}
