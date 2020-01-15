package com.arthur.framework.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("order")
public class Order {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer userId;
    private String orderNo;
    private Integer orderStatus;
    private Integer pcs;
    private Integer totalAmount;
    private Integer totalFee;
    private Integer userAddressId;
    private Integer payChannel;
    private String outTradeNo;
    private String outSerialNo;
    private String remark;
    private Long paidAt;
    private Long createdAt;
    private Long updatedAt;

}
