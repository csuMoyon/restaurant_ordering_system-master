package com.work.restaurant_ordering_system.entity;

import lombok.Data;

/*

 */
@Data
public class ModifyPassword {

    /**
     *
     */
    private String userId;

    /**
     *
     */
    private String oldPassword;

    /**
     *
     */
    private String newPasswrod;
}
