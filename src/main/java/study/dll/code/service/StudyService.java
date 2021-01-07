package study.dll.code.service;
import com.baomidou.mybatisplus.extension.service.IService;
import study.dll.code.entity.Person;

public interface StudyService extends IService<Person> {

    String getString();

    Object getShow3();
}
