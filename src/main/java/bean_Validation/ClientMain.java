package bean_Validation;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientMain {
    public static void main(String[] args) {

        Resource res = new ClassPathResource("bean_Validation.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        Object obj = factory.getBean("student");
        Student std = (Student)obj;

        std.displayPrimitives();
        std.listData();
        std.subjectName();
    }
}
