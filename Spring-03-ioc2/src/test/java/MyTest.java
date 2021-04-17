import com.sqx.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        // 在获取到Spring容器时，容器内的类就已经初始化了
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-03/applicationContext.xml");
        UserT user = (UserT) context.getBean("us2");

        user.show();
    }
}
