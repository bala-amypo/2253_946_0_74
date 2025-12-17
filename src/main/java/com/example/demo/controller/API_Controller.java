package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Api;
import com.example.demo.service.ApiService;

@RestController
public class API_Controller{
    @Autowired
   ApiService Aser;
     

     @PostMapping("/adddata")
     public Api createData(@RequestBody Api a){
        return Aser.createData(a);
     }

     @GetMapping("/fetchdata")
     public List<Api> fetchRecord(){
        return Aser.fetchRecord();
     }
//for to find data by id
     @GetMapping("/fetchdatabyid/{id}")
     public <Api> fetchdataById(@PathVariable int id)
     return Aser.fetchdataById(id);
}