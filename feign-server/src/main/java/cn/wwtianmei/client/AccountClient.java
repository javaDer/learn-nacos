package cn.wwtianmei.client;

import cn.wwtianmei.client.hystrix.AccountClentHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhaofa
 * @title: IndexControllers
 * @date 2019-07-05 16:18
 */
@FeignClient(value = "provider-service", fallback = AccountClentHystrix.class)
public interface AccountClient {
    @GetMapping("/echo/{name}")
    String hello(@RequestParam(name = "name") String name);

}
