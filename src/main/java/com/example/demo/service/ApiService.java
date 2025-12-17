package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.Api;
public interface ApiService {
 Api createData(Api a);
   List<Api> fetchRecord();
   Optional<Api>fetchDataById();

}