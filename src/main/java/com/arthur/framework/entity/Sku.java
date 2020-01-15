package com.arthur.framework.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sku")
public class Sku {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer spuId;
    private String name;
    private String poster;
    private Integer price;
    private Integer stock;
    private String specJson;
    private Long createdAt;
    private Long updatedAt;
}
