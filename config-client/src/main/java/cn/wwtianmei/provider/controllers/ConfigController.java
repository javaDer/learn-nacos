package cn.wwtianmei.provider.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaofa
 * @title: IndexControllers
 * @date 2019-07-05 16:18
 */
@Slf4j
@RestController
@RefreshScope
@RequestMapping("/config")
public class ConfigController {
    @Value("${didispace.title:}")
    private String title;
    @GetMapping("/get")
    public String get() {
        log.info(title);
        return "hello " + title;
    }

}
