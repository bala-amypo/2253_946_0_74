package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@service
public class Api_SerImplementation implements ApiService {
    @Autowired 
    Api_Repository repo;

    @Override
    public Api createData(Api a){
        return repo.save(a);
    }
    @Override 
    public List<Api> fetchRecord(){
        return repo.findAll();
    }

}