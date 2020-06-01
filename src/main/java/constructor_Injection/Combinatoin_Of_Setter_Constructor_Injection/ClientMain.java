package constructor_Injection.Combinatoin_Of_Setter_Constructor_Injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientMain {
    public static void main(String[] args) {

        Resource res = new ClassPathResource("Combinatoin_Of_Setter_Constructor_Injection.xml");
        BeanFactory factory = new XmlBeanFactory(res);

        Object object = factory.getBean("demoBean");
        DemoBean db = (DemoBean)object;
        // here we will get setter injection value
        // because Setter Injection override Constructor Injection
        System.out.println(db);

    }
}
