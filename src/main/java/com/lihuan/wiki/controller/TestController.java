package com.lihuan.wiki.controller;

import com.lihuan.wiki.domain.Test;
import com.lihuan.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
//@Controller 返回一个页面
public class TestController {

    //可自己添加配置项，SpringBoot会自己读取配置项，冒号后是默认，没读取到会使用默认
    @Value("${test.hello:TEST}")
    private String testHello;
    @Resource
    private TestService testService;

    /*
    *GET，POST，PUT，DELETE
    * 查   增    改    删
    * */


    /*@PostMapping("/hello") 请求的几种方法
    @PutMapping("/hello")
    @DeleteMapping("/hello")
    @RequestMapping(value = "/user/1",method = RequestMethod.GET)*/
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! post," + name;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
