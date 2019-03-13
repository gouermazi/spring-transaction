package com.cj.perf.web.dao;

import com.cj.pojo.Stu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

/**
 * @author chen·jie
 */
@Mapper
public interface InfoMapper {

    @Insert("insert into info (age) values (#{age}) ")
    @Options(useGeneratedKeys = true, keyProperty="id", keyColumn="id")
    int insert(Stu stu);

}
