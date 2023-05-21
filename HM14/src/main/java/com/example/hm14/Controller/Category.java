package com.example.hm14.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/category")
public class Category {

    ArrayList<Category> categories=new ArrayList<>();


    //read
    @GetMapping("/get")
    public ArrayList<Category> getCategorie(){
        return categories;
    }

    //create
    @PostMapping("/add")
    public String  addCategory(@RequestBody Category category){
        categories.add(category);
        return "Category added!";
    }

    //update -  Put
    @PutMapping("/update/{index}")
    public String updateCategory(@PathVariable int index, @RequestBody Category category){
        categories.set(index, category);
        return "Category update";
    }


    //delete
    @DeleteMapping("/delet/{index}")
    public String deleteCategory(@PathVariable int index){
        categories.remove(index);
        return "Category delete";
    }


}
