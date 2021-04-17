import com.sqx.config.UserConfig;
import com.sqx.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);

        User user = context.getBean("getUser", User.class);

        System.out.println(user.getName());
    }
}
