package cn.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "serviceFailure")
    public String getHelloContent(){
        return restTemplate.getForObject("http://HelloApplication/",String.class);
    }

    public String serviceFailure(){
        return "HelloApplication service was not avaliable";
    }
}
