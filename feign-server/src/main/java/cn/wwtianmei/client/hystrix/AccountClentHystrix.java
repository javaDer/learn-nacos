package cn.wwtianmei.client.hystrix;

import cn.wwtianmei.client.AccountClient;
import cn.wwtianmei.models.ResultModel;
import org.springframework.stereotype.Component;

@Component
public class AccountClentHystrix implements AccountClient {
    @Override
    public String hello(String name) {
        return ResultModel.getErrorResult("服务中断。。。").toString();
    }
//    @Override
//    public ResultModel service01(String userId) {
//        return ResultModel.getErrorResult("服务中断。。。");
//
//    }


}