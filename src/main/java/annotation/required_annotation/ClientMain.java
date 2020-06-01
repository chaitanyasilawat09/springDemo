package annotation.required_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Properties;

public class ClientMain {

    public static void main(String[] args) throws IOException {

        ApplicationContext app = new ClassPathXmlApplicationContext("annotation_requiredAnnotation.xml");

        Object obj = app.getBean("employee");
        Employee emp = (Employee)obj;
        emp.print();

    }
}
