package com.example.hm14.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/product")
public class Product {

    ArrayList<Product> products=new ArrayList<>();


    //read
    @GetMapping("/get")
    public ArrayList<Product> getProduct(){
        return products;
    }

    //create
    @PostMapping("/add")
    public String  addProduct(@RequestBody Product product){
        products.add(product);
        return "Product added!";
    }

    //update -  Put
    @PutMapping("/update/{index}")
    public String updateProduct(@PathVariable int index, @RequestBody Product product){
        products.set(index, product);
        return "Product update";
    }


    //delete
    @DeleteMapping("/delet/{index}")
    public String deleteProduct(@PathVariable int index){
        products.remove(index);
        return "Product delete";
    }

}
