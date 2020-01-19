package com.arthur.framework.service.impl;

import com.arthur.framework.bean.dto.CategoryListDTO;
import com.arthur.framework.bean.vo.CategoryListVO;
import com.arthur.framework.bean.vo.PageVO;
import com.arthur.framework.entity.Category;
import com.arthur.framework.mapper.CategoryMapper;
import com.arthur.framework.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public PageVO<CategoryListVO> selectCategory(CategoryListDTO categoryListDTO) {
        QueryWrapper<Category> queryWrapper = new QueryWrapper<>();

        Page<Category> page = new Page<>(categoryListDTO.getPage(), categoryListDTO.getPageSize());
        Page<Category> categoryPage = categoryMapper.selectPage(page, queryWrapper);

        List<CategoryListVO> categoryList = new ArrayList<>();
        if (categoryPage.getRecords() != null) {
            for (Category record : categoryPage.getRecords()) {
                CategoryListVO categoryListVO = new CategoryListVO();
                categoryListVO.setId(record.getId());
                categoryListVO.setName(record.getName());
                categoryListVO.setCoverImage(record.getCoverImage());
                categoryListVO.setPid(record.getPid());
                categoryListVO.setSort(record.getSort());
                categoryListVO.setStatus(record.getStatus());
                categoryListVO.setIsShowIndex(record.getIsShowIndex());
                categoryListVO.setCreatedAt(record.getCreatedAt());
                categoryListVO.setUpdatedAt(record.getUpdatedAt());

                categoryList.add(categoryListVO);
            }
        }
        IPage<CategoryListVO> categoryPageList = new Page<>();
        BeanUtils.copyProperties(categoryPage, categoryPageList);
        categoryPageList.setRecords(categoryList);
        return new PageVO<>(categoryPageList);
    }
}
