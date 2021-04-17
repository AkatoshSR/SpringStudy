import com.sqx.Dao.UserDaoMysqlImpl;
import com.sqx.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//    // 1.无Spring
//        // 用户实际调用业务层
//        UserService userService = new UserServiceImpl();
//        //....
//
//        // 控制反转
//        userService.setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();
//        //...

    // 2.使用Spring
        // 获取ApplicationContext：拿到Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 需要什么就直接get
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");

        userServiceImpl.getUser();

    }

}
