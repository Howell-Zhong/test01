package com.jt99.myeasybuy.util;

public class ResponseResult<T> {

    private String resultCode;
    private String resultMsg;
    private T t;

    public ResponseResult() {
    }

    public ResponseResult(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public ResponseResult(String resultCode, String resultMsg, T t) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.t = t;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    //如果成功用这个，静态方法，只传入数据，其它为默认值
    public static<T> ResponseResult<T> createSuccess(T data){
        return new ResponseResult<T>("00","操作成功",data);
    }

    public static<T> ResponseResult<T> createSuccess(String resultMsg,T data){
        return new ResponseResult<T>("00",resultMsg,data);
    }

    //如果没有返回值成功用这个，静态方法，不用传入数据，其它为默认值
    public static<T> ResponseResult<T> createSuccess(String resultMsg){
        return new ResponseResult<T>("00",resultMsg);
    }

    //如果失败用这个，静态方法，不用传入数据，其它为默认值，直接return
    public static<T> ResponseResult<T> createError(){
        return new ResponseResult<T>("-1","操作失败");
    }

    public static<T> ResponseResult<T> createError(String resultMsg){
        return new ResponseResult<T>("-1",resultMsg);
    }
}
