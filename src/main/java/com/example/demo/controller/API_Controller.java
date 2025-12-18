package com.example.demo.controller;


import java.util.List;
import org.springframework.web.bind.annotation.*;

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
     public Optional<Api> fetchDataById(@PathVariable long id){
     return Aser.fetchDataById(id);
}
@PutMapping("/updatedata/{id}")
public String UpdateDataById(@PathVariable int id ,@RequestBody Api a){
   Optional<Api>api=Aser.fetchDataById(id);

   if(api.isPresent()){
   a.setId(id);
   Aser.createData(a);

   return "Updated succesfully";
}else{
   return id + "Not found";

}
}
@DeleteMapping("/deletedata/{id}")
public String deleteDataById(@PathVariable int id){
   Optional <Api>api=Aser.fetchDataById(id);
   if(api.isPresent()){
      Aser.deleteData(id);
      return "Data deleted Successfully";
   }else{
      return id+ "not found";
   }
}


}