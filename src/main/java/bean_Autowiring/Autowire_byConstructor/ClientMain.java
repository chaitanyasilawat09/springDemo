package bean_Autowiring.Autowire_byConstructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientMain {
    public static void main(String[] args) {

        Resource rs = new ClassPathResource("autowire_byConstructor");
        BeanFactory factory = new XmlBeanFactory(rs);
        Object obj = factory.getBean("exampleBean");

        ExampleBean exampleBean = (ExampleBean)obj;
        exampleBean.showExampleBean();
    }
}
