package cn.wwtianmei.provider.service.impl;

import cn.wwtianmei.provider.model.News;
import cn.wwtianmei.provider.service.SinaNewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaofa
 * @title: SinaNewServiceImpl
 * @date 2019-07-17 18:54
 */
@Service
@Slf4j
public class SinaNewServiceImpl implements SinaNewService {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<News> findAllNews() {
        Query query = new Query();
        query.limit(100);
        List<News> mapList = mongoTemplate.findAll(News.class);
        return mapList;
    }
}
