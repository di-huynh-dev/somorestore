package com.onlinestorewepr;

import com.onlinestorewepr.entity.Category;
import com.onlinestorewepr.service.CategoryService;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    CategoryService categoryService = new CategoryService();
    List<Category> categories = categoryService.getAllCategories();
    for (Category category : categories) {
      System.out.println("Name: " + category.getName());
      System.out.println("Products: " + category.getProducts());
    }
  }
}
