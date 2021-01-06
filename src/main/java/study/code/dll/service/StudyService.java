package study.code.dll.service;
import com.baomidou.mybatisplus.extension.service.IService;
import study.code.dll.entity.Person;

public interface StudyService extends IService<Person> {

    String getString();

    Object getShow3();
}
