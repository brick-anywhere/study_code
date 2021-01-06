package study.code.dll.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import study.code.dll.entity.Person;

@Mapper
public interface PersonMapper  extends BaseMapper<Person> {
}
