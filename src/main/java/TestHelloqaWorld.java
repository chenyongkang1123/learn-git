import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Created by Administrator on 2019/5/17.
 */
public class TestHelloqaWorld {
    public static void main(String[]args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld hw =(HelloWorld)ac.getBean("helloworld");
        System.out.println(hw.getName());
        }
}
