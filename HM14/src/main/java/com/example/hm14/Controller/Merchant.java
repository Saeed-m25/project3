package com.example.hm14.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/merchant")
public class Merchant {

    ArrayList<Merchant> merchants=new ArrayList<>();


    //read
    @GetMapping("/get")
    public ArrayList<Merchant> getMerchant(){
        return merchants;
    }

    //create
    @PostMapping("/add")
    public String  addMerchant(@RequestBody Merchant merchant){
        merchants.add(merchant);
        return "Merchant added!";
    }

    //update -  Put
    @PutMapping("/update/{index}")
    public String updateMerchant(@PathVariable int index, @RequestBody Merchant merchant){
        merchants.set(index, merchant);
        return "Merchant update";
    }


    //delete
    @DeleteMapping("/delet/{index}")
    public String deleteMerchant(@PathVariable int index){
        merchants.remove(index);
        return "Merchant delete";
    }

}
