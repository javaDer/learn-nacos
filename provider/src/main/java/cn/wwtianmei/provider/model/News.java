package cn.wwtianmei.provider.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

/**
 * @author zhaofa
 * @title: News
 * @date 2019-07-18 10:44
 */
@Data
@Document(collection = "news")
public class News {
    @Id
    private String id;
    private String title;
    private String link;
    private String media_name;
    private String article;
    private String time;
}
