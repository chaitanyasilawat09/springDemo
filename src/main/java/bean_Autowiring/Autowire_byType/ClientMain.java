package bean_Autowiring.Autowire_byType;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientMain {
    public static void main(String[] args) {

        Resource resource = new ClassPathResource("autowire_byName.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Object o = factory.getBean("example");
        ExampleBean eb = (ExampleBean)o;
        eb.showExample();
    }
}
