package cn.wwtianmei.provider.controllers;

import cn.wwtianmei.models.ResultModel;
import cn.wwtianmei.provider.model.News;
import cn.wwtianmei.provider.service.SinaNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhaofa
 * @title: SinaControllers
 * @date 2019-07-17 18:43
 */
@RestController
@RequestMapping("/article")
public class SinaNewControllers {
    @Autowired
    private SinaNewService sinaNewService;

    @PostMapping("/index")
    private ResultModel index() {
        ResultModel<List<News>> data = new ResultModel<List<News>>();
        List<News> allNews = sinaNewService.findAllNews();
        data.setData(allNews);
        return data;
    }


}
