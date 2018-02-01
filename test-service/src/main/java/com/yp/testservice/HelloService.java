package com.yp.testservice;

import com.yp.Entity.QuestionEntity;
import com.yp.testmapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {

    public static String sayHello(){
        return "hello";
    }

    public String Hello(){
        return "hello";
    }
    @Autowired
    private TestMapper testMapper;

    public List<QuestionEntity> list (){
        return testMapper.getAllQuestions();
    }
}
