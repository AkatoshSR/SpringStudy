import com.sqx.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        // 获取Spring上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 对象交给Spring管理
        Hello hello = (Hello) context.getBean("hello");

        System.out.println(hello);

    }
}
