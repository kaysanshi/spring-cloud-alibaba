package com.kaysanshi.spring.cloud.alibaba.nacos.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author kay三石
 * @date:2020/10/19
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class NacosConsumerFeignApplication  {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerFeignApplication.class);
    }
}
