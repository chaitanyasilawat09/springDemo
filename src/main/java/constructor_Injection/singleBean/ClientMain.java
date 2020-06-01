package constructor_Injection.singleBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientMain {
    public static void main(String[] args) {

        Resource resource = new ClassPathResource("CI_config.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Object o = factory.getBean("demoBean");
        DemoBean db = (DemoBean)o;
        db.showMessage();


    }
}
