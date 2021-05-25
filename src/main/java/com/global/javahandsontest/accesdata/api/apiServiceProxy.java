package com.global.javahandsontest.accesdata.api;

import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(name = "api-service")
    public interface apiServiceProxy extends apiService{

}
