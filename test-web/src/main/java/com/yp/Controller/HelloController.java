package com.yp.Controller;

import com.yp.Entity.QuestionEntity;
import com.yp.testservice.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("hello")
    public String hello(){
        return helloService.Hello();
    }
    @RequestMapping("all")
    public List<QuestionEntity> list (){
        return helloService.list();
    }
}
