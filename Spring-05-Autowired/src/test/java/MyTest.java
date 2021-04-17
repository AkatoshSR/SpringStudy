import com.sqx.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        People people = context.getBean("people", People.class);

        people.getCat().shout();
        people.getDog().shout();
    }
}
