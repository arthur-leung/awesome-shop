package com.arthur.framework.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController {
    @RequestMapping("/")
    public String index(Model model) {
        return "index/index";
    }
}
