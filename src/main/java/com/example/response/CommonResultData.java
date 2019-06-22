package com.example.response;


import com.example.exception.ResultStatusEnum;

public class CommonResultData {

    private int code;

    private Object data;

    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "CommonResultData [code=" + code + ", data=" + data + ", msg=" + msg + "]";
    }

    public CommonResultData() {}

    public CommonResultData(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public static CommonResultData success(Object data) {
        return new CommonResultData(ResultStatusEnum.SUCCESS.getCode(), data,
            ResultStatusEnum.SUCCESS.getMessage());
    }

    public static CommonResultData error(int code, String msg) {
        return new CommonResultData(code, msg);
    }

    public static CommonResultData success() {
        return new CommonResultData(ResultStatusEnum.SUCCESS.getCode(),
            ResultStatusEnum.SUCCESS.getMessage());
    }

    public CommonResultData(int code, Object data, String msg) {
        super();
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

}
