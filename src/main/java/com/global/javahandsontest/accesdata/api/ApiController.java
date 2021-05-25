package com.global.javahandsontest.accesdata.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/*import javax.xml.ws.RespectBinding;*/
import java.util.Arrays;
import java.util.List;

//@CrossOrigin(origins = "http://localhost:4201")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@EnableFeignClients(basePackageClasses = apiServiceProxy.class)
public class ApiController implements apiService{

    private apiServiceProxy proxy;

    public ApiController(apiServiceProxy proxy) {
        this.proxy = proxy;
    }
        @Override
        @GetMapping("/api/Employees") //consume: http://masglobaltestapi.azurewebsites.net/api/Employees /para consumir: http://localhost:9007/api/Employees
        public List<Object> getCountries() {
            List<Object> x = proxy.getCountries();
            return proxy.getCountries();
        }

        @Override
        @GetMapping("/products")
        public List<Object> getProducts() {
        return proxy.getProducts();
        }
    }
