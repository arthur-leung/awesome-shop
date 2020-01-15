package com.arthur.framework.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("category")
public class Category {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer pid;
    private String coverImage;
    private Integer isShowIndex;
    private Integer status;
    private Integer sort;
    private Long createdAt;
    private Long updatedAt;
}
