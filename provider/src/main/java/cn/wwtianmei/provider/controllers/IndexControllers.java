package cn.wwtianmei.provider.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaofa
 * @title: IndexControllers
 * @date 2019-07-05 16:18
 */
@Slf4j
@RestController

public class IndexControllers {
    @GetMapping("/echo/{name}")
    public String echo(@PathVariable String name) {
        return "hello " + name;
    }
}
