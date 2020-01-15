package com.arthur.framework.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("spu_spec")
public class SpuSpec {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer spuId;
    private String name;
    private Integer sort;
}
