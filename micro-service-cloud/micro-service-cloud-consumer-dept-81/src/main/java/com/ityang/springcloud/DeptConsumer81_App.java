package com.ityang.springcloud;

import com.ityang.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
/*
* 注意：
*   a:  这个自动以配置类不能放在@ComponentScan所扫描的当前包下以及子包下
*   b:  否则这个自定义的配置类就会被所有的Ribbon客户端所共享，也就是说我们达不到特殊化定制的目的。
*
* */
@EnableFeignClients(basePackages= {"com.ityang.springcloud"})
@ComponentScan("com.ityang.springcloud")
public class DeptConsumer81_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer81_App.class, args);
    }
}
