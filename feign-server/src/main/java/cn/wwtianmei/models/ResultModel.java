package cn.wwtianmei.models;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: zhengbiao
 * @Date: 2019/4/1 14:34
 * @Description:
 */
@Data
public class ResultModel<T> implements Serializable {

    private String msg;
    private int code;
    private T data;
    private static ResultModel getResult(int code, String msg, Object data) {
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(code);
        resultModel.setData(data);
        resultModel.setMsg(msg);
        return resultModel;
    }
    public static ResultModel getErrorResult(int code, String msg, Object data) {
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(code);
        resultModel.setData(data);
        resultModel.setMsg(msg);
        return resultModel;
    }
    public static ResultModel getErrorResult(String message) {
        return getResult(0, message, (Object)null);
    }
    public static ResultModel getSuccessResult(Object result) {
        return getResult(200, "成功", result);
    }

    public static ResultModel getSuccessResult() {
        return getResult(200, "成功", (Object)null);
    }

}
