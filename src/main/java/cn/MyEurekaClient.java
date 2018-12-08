package cn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName EurekaClient
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/12/8 1:02
 * @Version 1.0
 */
@SpringBootApplication
@RestController
public class MyEurekaClient {

    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home(){
        return "hello world from port: " + port;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyEurekaClient.class);
    }
}
