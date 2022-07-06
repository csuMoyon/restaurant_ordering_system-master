package com.work.restaurant_ordering_system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @TableName orderout
 */
@TableName(value ="orderout")
@Data
public class OrderOut implements Serializable {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Integer orderid;

    /**
     *
     */
    private String address;

    /**
     *
     */
    private String allfood;

    /**
     *
     */
    private String orderoutcheck;

    /**
     *
     */
    private String userid;

    /**
     *
     */
    private String orderoutcomment;

    /**
     *
     */
    private Date orderouttime;

    /**
     *
     */
    //public ArrayList<AllFood> allFoods;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

//    public String listToString(ArrayList list)
//    {
//        String result="";
//        for(int i=0;i<list.size();i++)
//        {
//            result+=list.get(i);
//        }
//        return result;
//    }
//
//    public ArrayList<String> stringToList(String s)
//    {
//        int number=0;
//        ArrayList<String> result=new ArrayList<>(20);
//        for(int i=0;i<s.length();i++)
//        {
//            char tem = s.charAt(i);
//            if(tem!=',')
//            {
//                String tem0=result.get(number);
//                tem0+=tem;
//                result.set(number,tem0);
//            }
//            else
//            {
//                number++;
//            }
//        }
//        return result;
//    }
}