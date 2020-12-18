package study.util;

import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;
import study.code.dll.entity.Person;

import java.util.Properties;

/**
 * @author dll
 * @date 2020-12-18 10:57
 */
public class StudySpringUtils {

    @Test
    public void checkEntity() {
        Person sun = null;
        boolean empty = StringUtils.isEmpty(sun);
        System.out.println("empty = " + empty);

        Person person = new Person();
        boolean empty1 = StringUtils.isEmpty(person);
        System.out.println("empty1 = " + empty1);

        Person person1 = new Person();
        person1.setName("张三");
        boolean empty2 = StringUtils.isEmpty(person1);
        System.out.println("empty2 = " + empty2);
        Person person2 = new Person();
        BeanUtils.copyProperties(person1, person2);

        System.out.println("person2.getName() = " + person2.getName());
        System.out.println("person1.hashCode()" + person1.hashCode());
        System.out.println("person2.hashCode()" + person2.hashCode());
        boolean equals = person1.equals(person2);
        System.out.println("equals = " + equals);

    }

    @Test
    public void checkProperties() {
        Properties properties = System.getProperties();
        String property = properties.getProperty("os.name");
        System.out.println("property = " + property);
        String computername = System.getenv().get("COMPUTERNAME");
        System.out.println("computername = " + computername);
    }

    @Test
    public void checkStringUtils() {
        System.out.println("====================================================");
        System.out.println("org.springframework.util.StringUtils");
        System.out.println("null = " + StringUtils.hasText(null));
        System.out.println("字符串“” = " + StringUtils.hasText(""));
        System.out.println("字母A = " + StringUtils.hasText("A"));
        System.out.println("空格 = " + StringUtils.hasText(" "));
        System.out.println("====================================================");
        System.out.println("org.apache.commons.lang3.StringUtils");
        boolean blank = org.apache.commons.lang3.StringUtils.isBlank(null);
        System.out.println("null = " + blank);
        boolean nullCharacterString = org.apache.commons.lang3.StringUtils.isBlank("");
        System.out.println("空字符串 isBlank = " + nullCharacterString);
        boolean empty = org.apache.commons.lang3.StringUtils.isEmpty("");
        System.out.println("空字符串 isEmpty = " + empty);
        int compare = org.apache.commons.lang3.StringUtils.compare("A", "A");
        System.out.println("compare = " + compare);
    }
}
