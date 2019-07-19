package cn.wwtianmei.provider.controllers;

import cn.wwtianmei.models.ResultModel;
import cn.wwtianmei.provider.model.News;
import cn.wwtianmei.provider.service.SinaNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhaofa
 * @title: SinaControllers
 * @date 2019-07-17 18:43
 */
@RestController
@RequestMapping("/article")
public class SinaNewControllers {
    @Resource
    private SinaNewService sinaNewService;

    @RequestMapping("/index")
    private ResultModel index() {
        ResultModel<List<News>> data = new ResultModel<List<News>>();
        data.setCode(HttpStatus.OK.value());
        data.setMsg("查询成功");
        List<News> allNews = sinaNewService.findAllNews();
        data.setData(allNews);
        return data;
    }


}
