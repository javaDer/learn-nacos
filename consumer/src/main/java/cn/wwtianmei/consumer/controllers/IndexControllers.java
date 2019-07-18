package cn.wwtianmei.consumer.controllers;

import cn.wwtianmei.client.AccountClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaofa
 * @title: IndexControllers
 * @date 2019-07-05 16:18
 */
@Slf4j
@RestController

public class IndexControllers {
    @Autowired
    private AccountClient accountClient;
    @GetMapping("/echo/{name}")
    public String test(@PathVariable("name") String name) {
        // 通过spring cloud common中的负载均衡接口选取服务提供节点实现接口调用
        // serviceId为spring.application.name
        String hello = accountClient.hello(name);
        return hello;
    }

}
