package com.dll.code.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dll.code.entity.Person;
import com.dll.code.mapper.PersonMapper;
import com.dll.code.service.StudyService;
import org.springframework.stereotype.Service;

/**
 * @author dll
 * @date 2020-12-18 15:33
 */
@Service
public class StudyServiceImpl extends ServiceImpl<PersonMapper, Person> implements StudyService {
    @Override
    public String getString() {
        return "这是一个字符串";
    }

    @Override
    public Object getShow3() {
        return this.getById(1);
    }


}
