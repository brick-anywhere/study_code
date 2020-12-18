package study.code.dll.service.impl;

import org.springframework.stereotype.Service;
import study.code.dll.service.StudyService;

/**
 * @author dll
 * @date 2020-12-18 15:33
 */
@Service
public class StudyServiceImpl implements StudyService {
    @Override
    public String getString() {
        return "这是一个字符串";
    }
}
