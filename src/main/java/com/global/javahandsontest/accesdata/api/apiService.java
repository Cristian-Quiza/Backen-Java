package com.global.javahandsontest.accesdata.api;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface apiService {

//    @GetMapping("/api/Employees")
    @GetMapping("/api/Employees")
    public List<Object> getCountries();

    @GetMapping("/products")
    public List<Object> getProducts();
}
