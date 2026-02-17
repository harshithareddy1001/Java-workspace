package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController//It executes data and service in the form of JSON/XML.
public class MainController {
    List<String> list=new ArrayList<>();
    public MainController(){
        list.add("Vaishu");list.add("Harshitha");list.add("Chinmayi");
    }

    //    @RequestMapping("/list")
//    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @GetMapping("/list")

    public List<String> list() {
        return list;
    }
    @GetMapping("/findone/{index}")
    public String findone(@PathVariable int index) {
        return list.get(index);
    }

    public void show(){

    }
    @PostMapping("/add")

    public void add(@RequestBody String name){
        //list. add("Netra");
        list.add(name);
    }
    @PutMapping("/update")
    public void update(){
        list.set(3,"sunny");
    }
    @DeleteMapping("/delete")
    public void delete(){
        list.remove(2);
    }
    @PutMapping("/update/{index}")
    public String update(@PathVariable int index, @RequestBody String name) {
        list.set(index, name);
        return "Updated value at index " + index;
    }
    @DeleteMapping("/delete/{index}")
    public String delete(@PathVariable int index) {
        if(index >= 0 && index < list.size()) {
            list.remove(index);
            return "Deleted element at index " + index;
        } else {
            return "Invalid index";
        }
    }



}