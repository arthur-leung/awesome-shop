package com.arthur.framework.service;

import com.arthur.framework.bean.dto.CategoryListDTO;
import com.arthur.framework.bean.vo.CategoryListVO;
import com.arthur.framework.bean.vo.PageVO;
import com.arthur.framework.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

public interface CategoryService extends IService<Category> {
    PageVO<CategoryListVO> selectCategory(CategoryListDTO categoryListDTO);
}
