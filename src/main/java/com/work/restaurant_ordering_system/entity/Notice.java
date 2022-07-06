package com.work.restaurant_ordering_system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName notice
 */
@TableName(value ="notice")
@Data
public class Notice implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer noticeid;

    /**
     * 
     */
    private String noticesource;

    /**
     * 
     */
    private String noticereceiver;

    /**
     * 
     */
    private Date noticetime;

    /**
     * 
     */
    private String text;

    /**
     *
     */
    private String ifchecked;

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
        Notice other = (Notice) that;
        return (this.getNoticeid() == null ? other.getNoticeid() == null : this.getNoticeid().equals(other.getNoticeid()))
            && (this.getNoticesource() == null ? other.getNoticesource() == null : this.getNoticesource().equals(other.getNoticesource()))
            && (this.getNoticereceiver() == null ? other.getNoticereceiver() == null : this.getNoticereceiver().equals(other.getNoticereceiver()))
            && (this.getNoticetime() == null ? other.getNoticetime() == null : this.getNoticetime().equals(other.getNoticetime()))
            && (this.getText() == null ? other.getText() == null : this.getText().equals(other.getText()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNoticeid() == null) ? 0 : getNoticeid().hashCode());
        result = prime * result + ((getNoticesource() == null) ? 0 : getNoticesource().hashCode());
        result = prime * result + ((getNoticereceiver() == null) ? 0 : getNoticereceiver().hashCode());
        result = prime * result + ((getNoticetime() == null) ? 0 : getNoticetime().hashCode());
        result = prime * result + ((getText() == null) ? 0 : getText().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", noticeid=").append(noticeid);
        sb.append(", noticesource=").append(noticesource);
        sb.append(", noticereceiver=").append(noticereceiver);
        sb.append(", noticetime=").append(noticetime);
        sb.append(", text=").append(text);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}