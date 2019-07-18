package com.wwtianmei.auth.controllers;

import cn.wwtianmei.models.ResultModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaofa
 * @title: UserController
 * @date 2019-07-18 14:21
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    private ResultModel login() {
        return null;
    }
}
