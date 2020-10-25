package com.kaysanshi.spring.cloud.alibaba.nacos.consumer.feign.service;

import org.springframework.stereotype.Component;

/**
 * @Author kay三石
 * @date:2020/10/19
 */
@Component
public class EchoServiceFallback implements EchoService{
    @Override
    public String echo(String message) {
        return null;
    }

    @Override
    public String echo1(String message) {
        return null;
    }
}

