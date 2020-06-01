package bean_Autowiring.Autowire_byAutodetect;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientMain {
    public static void main(String[] args) {

        Resource res = new ClassPathResource("autowire_byAutodetect");
        BeanFactory factory = new XmlBeanFactory(res);
        Object obj = factory.getBean("exampleBean");

        ExampleBean exampleBean = (ExampleBean)obj;
        exampleBean.showExampleBean();
    }
}
