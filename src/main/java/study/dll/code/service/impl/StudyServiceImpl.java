package study.dll.code.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import study.dll.code.entity.Person;
import study.dll.code.mapper.PersonMapper;
import study.dll.code.service.StudyService;

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
