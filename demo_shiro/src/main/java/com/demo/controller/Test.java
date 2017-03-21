package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test 功能描述：控制器示例
 *
 * @author RickyLee【lsr@sdzn.com.cn】
 * @date 2017/3/21 10:34
 */
@RestController
@RequestMapping(value = "/test")
public class Test {
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(){
        return  "tt";
    }

}