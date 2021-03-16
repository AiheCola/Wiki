package com.lihuan.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller 返回一个页面
public class TestController {

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
        return "Hello World!";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! post," + name;
    }
}
