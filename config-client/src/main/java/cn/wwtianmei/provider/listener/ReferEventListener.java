package cn.wwtianmei.provider.listener;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.endpoint.event.RefreshEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zhaofa
 * @title: ReferEventListener
 * @date 2019-07-05 18:56
 */
@Slf4j
@Component
public class ReferEventListener implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return aClass == RefreshEvent.class;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        RefreshEvent refreshEvent = (RefreshEvent) applicationEvent;
        log.info("事件内容：{}", JSON.toJSONString(refreshEvent));

    }
}
