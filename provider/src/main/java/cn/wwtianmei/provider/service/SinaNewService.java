package cn.wwtianmei.provider.service;

import cn.wwtianmei.provider.model.News;

import java.util.List;

/**
 * @author zhaofa
 * @title: SinaNewService
 * @date 2019-07-17 18:53
 */
public interface SinaNewService {
    List<News> findAllNews();
}
