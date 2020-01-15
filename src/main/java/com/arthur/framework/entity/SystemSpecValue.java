package com.arthur.framework.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("system_spec_value")
public class SystemSpecValue {
  @TableId(type = IdType.AUTO)
  private Integer id;
  private String name;
  private Integer systemSpecId;
  private Integer sort;

}
