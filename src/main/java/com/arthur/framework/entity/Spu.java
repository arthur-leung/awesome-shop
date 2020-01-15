package com.arthur.framework.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("spu")
public class Spu {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer categoryId;
    private Integer brandId;
    private Integer price;
    private String sketch;
    private String intro;
    private Integer stock;
    private String coverImage;
    private Integer status;
    private Integer sort;
    private Long createdAt;
    private Long updatedAt;
}
