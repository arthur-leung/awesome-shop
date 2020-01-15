package com.arthur.framework.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("shoppingCart")
public class ShoppingCart {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer userId;
    private Integer skuId;
    private Integer spuId;
    private String skuName;
    private Integer price;
    private Integer number;
    private String specData;
    private Long createdAt;
    private Long updatedAt;
}
