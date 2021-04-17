import com.sqx.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-04/UserBeans.xml");

        // p命名空间：利用反射
        //Student student = context.getBean("student", Student.class);

        // 类型转换
        User user = (User) context.getBean("user2");

        System.out.println(user);
        //System.out.println(student);
    }
}
