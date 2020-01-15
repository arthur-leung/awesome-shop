package com.arthur.framework.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sku_spec_value")
public class SkuSpecValue {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer skuId;
    private Integer spuId;
    private Integer specType;
    private Integer specId;
    private Long specValueId;
    private Long createdAt;
}
