package com.arthur.framework.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("order_detail")
public class OrderDetail {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer orderId;
    private Integer spuId;
    private Integer skuId;
    private String skuName;
    private String skuPoster;
    private Integer skuPrice;
    private Integer subPcs;
    private Integer subTotalAmount;
    private String remark;
    private Long createdAt;
    private Long updatedAt;
}
