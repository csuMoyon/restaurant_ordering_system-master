package com.work.restaurant_ordering_system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String userid;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String charactor;

    /**
     *
     */
    private String phone;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

//    @Override
//    public boolean equals(Object that) {
//        if (this == that) {
//            return true;
//        }
//        if (that == null) {
//            return false;
//        }
//        if (getClass() != that.getClass()) {
//            return false;
//        }
//        User other = (User) that;
//        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
//            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
//            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
//            && (this.getCharactor() == null ? other.getCharactor() == null : this.getCharactor().equals(other.getCharactor()));
//    }
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
//        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
//        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
//        result = prime * result + ((getCharactor() == null) ? 0 : getCharactor().hashCode());
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(getClass().getSimpleName());
//        sb.append(" [");
//        sb.append("Hash = ").append(hashCode());
//        sb.append(", id=").append(id);
//        sb.append(", userid=").append(userid);
//        sb.append(", password=").append(password);
//        sb.append(", charactor=").append(charactor);
//        sb.append(", serialVersionUID=").append(serialVersionUID);
//        sb.append("]");
//        return sb.toString();
//    }
}