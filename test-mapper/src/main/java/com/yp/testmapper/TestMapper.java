package com.yp.testmapper;

import com.yp.Entity.QuestionEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select(" SELECT * FROM question")
    List<QuestionEntity> getAllQuestions();

    @Insert("insert into question(id, question, answer) values (#{id}, #{question}, #{answer})")
    void insert(QuestionEntity questionEntity);
}
