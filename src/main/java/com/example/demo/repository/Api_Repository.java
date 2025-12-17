package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Api;
public interface Api_Repository  extends JpaRepository<Api,Integer>{
    
}