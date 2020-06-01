package annotation.On_Setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {
    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("annotation.On_Setter");
        Object o = app.getBean("student");
        Student s = (Student)o;
        s.show();
    }
}
