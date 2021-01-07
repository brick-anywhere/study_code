package study.dll.code.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import study.dll.code.entity.Person;

@Mapper
public interface PersonMapper  extends BaseMapper<Person> {
}
