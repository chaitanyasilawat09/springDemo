package Setter_Injection.Dependency_Injection_Set_Collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientMain {
    public static void main(String[] args) {

        Resource resource = new ClassPathResource("SI_dependency_Injection_Set_Collection.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Object object = factory.getBean("id1");
        SampleBean sb = (SampleBean)object;
        sb.show();

    }
}
