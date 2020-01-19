package com.arthur.framework.web.controller.admin;

import com.arthur.framework.bean.dto.CategoryListDTO;
import com.arthur.framework.bean.vo.CategoryListVO;
import com.arthur.framework.bean.vo.PageVO;
import com.arthur.framework.entity.Category;
import com.arthur.framework.service.CategoryService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoryController extends BaseController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/category/list")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "1") int page,
                        @RequestParam(name = "pageSize", defaultValue = "5") int pageSize) {
        CategoryListDTO categoryListDTO = new CategoryListDTO();
        categoryListDTO.setPage(page);
        categoryListDTO.setPageSize(pageSize);

        final PageVO<CategoryListVO> categories = categoryService.selectCategory(categoryListDTO);
        model.addAttribute("data", categories);
        return "category/list";
    }

    @GetMapping("/category/edit")
    public String edit() {
        return "category/edit";
    }

    @PostMapping("category/edit")
    public String doEdit() {
        return "redirect:/category/list";
    }
}
