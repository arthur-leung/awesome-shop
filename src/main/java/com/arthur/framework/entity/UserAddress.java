package com.arthur.framework.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user_address")
public class UserAddress {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer userId;
    private String nickName;
    private String tel;
    private Integer provinceId;
    private String provinceName;
    private Integer cityId;
    private String cityName;
    private Integer areaId;
    private String areaName;
    private String postCode;
    private String address;
    private Integer isDefault;
    private Long createdAt;
    private Long updatedAt;
}
