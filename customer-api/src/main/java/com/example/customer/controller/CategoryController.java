package com.example.customer.controller;

import com.example.common.dto.CategoryDto;
import com.example.customer.service.CategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/api")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService=categoryService;
    }

    @ResponseBody
    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    @ApiOperation(value = "Category List(client)", notes = "카테고리 목록 불러오기")
    public List<CategoryDto> list(){ //DTO 처리 해야한다.
        List<CategoryDto> categoryDtoList= categoryService.getCategories();
        return categoryDtoList;
    }

}
