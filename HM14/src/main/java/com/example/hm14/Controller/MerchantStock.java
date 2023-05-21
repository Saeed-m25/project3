package com.example.hm14.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/merchantStock")
public class MerchantStock {

    ArrayList<MerchantStock> merchantStocks=new ArrayList<>();


    //read
    @GetMapping("/get")
    public ArrayList<MerchantStock> getMerchantStock(){
        return merchantStocks;
    }

    //create
    @PostMapping("/add")
    public String  addMerchantStock(@RequestBody MerchantStock merchantStock){
        merchantStocks.add(merchantStock);
        return "MerchantStock added!";
    }

    //update -  Put
    @PutMapping("/update/{index}")
    public String updateMerchantStock(@PathVariable int index, @RequestBody MerchantStock merchantStock){
        merchantStocks.set(index, merchantStock);
        return "MerchantStock update";
    }


    //delete
    @DeleteMapping("/delet/{index}")
    public String deleteMerchantStock(@PathVariable int index){
        merchantStocks.remove(index);
        return "MerchantStock delete";
    }

}
