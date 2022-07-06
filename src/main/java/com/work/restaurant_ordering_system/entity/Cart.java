package com.work.restaurant_ordering_system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName cart 暂时不再使用
 */
@TableName(value ="cart")
@Data
public class Cart implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String tableid;

    /**
     * 
     */
    private String allfood;

    /**
     *
     */
    //private List<AllFood> allfoods;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Cart other = (Cart) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTableid() == null ? other.getTableid() == null : this.getTableid().equals(other.getTableid()))
            && (this.getAllfood() == null ? other.getAllfood() == null : this.getAllfood().equals(other.getAllfood()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTableid() == null) ? 0 : getTableid().hashCode());
        result = prime * result + ((getAllfood() == null) ? 0 : getAllfood().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", table=").append(tableid);
        sb.append(", allfood=").append(allfood);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

//    public String listToString(List<String> list)
//    {
//        String result="";
//        for(int i=0;i<list.size();i++)
//        {
//            result+=list.get(i);
//        }
//        return result;
//    }
//
//    public List<String> stringToList(String s)
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