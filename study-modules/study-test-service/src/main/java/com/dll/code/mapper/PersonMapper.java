package com.dll.code.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dll.code.entity.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper  extends BaseMapper<Person> {
}
