package com.arthur.framework.bean.vo;

import lombok.Data;

@Data
public class CategoryListVO {
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
