package com.kaysanshi.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.kaysanshi.spring.cloud.alibaba.nacos.consumer.feign.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kay三石
 * @date:2020/10/19
 */
@RestController
public class NacosConsumerFeignController {

    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/echo/hi")
    public String echo(){
        return echoService.echo("Hi Feign");
    }
    // 测试负载均衡
    @GetMapping(value = "/echo2/hi")
    public String echo2(){
        return echoService.echo1("Hi Feign my is many port");
    }
}
