package cn.wwtianmei.provider;

import com.alibaba.nacos.api.config.annotation.NacosConfigListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhaofa
 */
@Slf4j
@SpringBootApplication
public class ConfigApplication {
    static final String DATA_ID = "alibaba-nacos-config-client.properties";

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

    @NacosConfigListener(dataId = DATA_ID)
    public void configChange(String config) {
        log.info("配置内容：{}", config);
    }
}
