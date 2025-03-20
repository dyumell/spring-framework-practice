package bibliothecadyumellis.spring.core;

import bibliothecadyumellis.spring.core.bean.User;
import bibliothecadyumellis.spring.core.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        // ApplicationContext 초기화
        String filePath = "config/users.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(filePath);

        // 빈 가져오기 & 실행
        User dyumell = context.getBean("dyumell",User.class);
        User earlgrey02 = context.getBean("earlgrey02",User.class);
        User sunso514 = context.getBean("sunso514",User.class);
        User fbwoduf112 = context.getBean("fbwoduf112",User.class);

        System.out.println("The following study members are " + dyumell.getName() + ", " + earlgrey02.getName()
        + ", " + sunso514.getName() + ", "+fbwoduf112.getName()+".");
    }
}
