package com.yp.testservice;

import com.yp.Entity.QuestionEntity;
import com.yp.testmapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**为了尽量保证数据库和缓存的数据一致性，写操作直接写库，读操作先读缓存没有再读数据库，并设置合理时间存入缓存*/
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

    @Autowired
    private RedisTemplate redisTemplate;

    public List<QuestionEntity> list (){
        QuestionEntity e = new QuestionEntity();
        e.setQuestion("hello");
        e.setAnswer("world");
        redisTemplate.opsForValue().set(e.getQuestion(),e);
        return testMapper.getAllQuestions();
    }

    public void save() throws Exception {
        QuestionEntity e = new QuestionEntity();
        e.setId("1212");
        e.setQuestion("hello");
        e.setAnswer("world");
        redisTemplate.opsForValue().set(e.getQuestion(),e);
        testMapper.insert(e);
    }
}
