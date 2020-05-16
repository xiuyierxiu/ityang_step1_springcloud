package com.ityang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.ityang.springcloud"})
@ComponentScan("com.ityang.springcloud")
public class DeptConsumer81_Feign_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer81_Feign_App.class, args);
    }
}
