package study.code.dll.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import study.code.dll.entity.Person;
import study.code.dll.mapper.PersonMapper;
import study.code.dll.service.StudyService;

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
