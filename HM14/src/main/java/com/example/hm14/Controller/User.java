package com.example.hm14.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/user")
public class User {

    ArrayList<User> users=new ArrayList<>();


    //read
    @GetMapping("/get")
    public ArrayList<User> getUser(){
        return users;
    }

    //create
    @PostMapping("/add")
    public String  addUser(@RequestBody User user){
        users.add(user);
        return "user added!";
    }

    //update -  Put
    @PutMapping("/update/{index}")
    public String updateUser(@PathVariable int index, @RequestBody User user){
        users.set(index, user);
        return "user update";
    }


    //delete
    @DeleteMapping("/delet/{index}")
    public String deleteUser(@PathVariable int index){
        users.remove(index);
        return "user delete";
    }
}
