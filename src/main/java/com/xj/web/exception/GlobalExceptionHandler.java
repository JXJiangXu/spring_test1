package com.xj.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

///**
// * 用于捕获全局异常
// */
//@ControllerAdvice//控制器切面
//
//public class GlobalExceptionHandler {
//    //处理异常的方法
//    @ExceptionHandler(RuntimeException.class)
//    @ResponseBody//返回json
//    public Map<String,Object> exceptionHandler(){
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("errorCode", "101");
//        map.put("errorMsg", "系統错误!");
//        return map;
//
//
//    }
//}
