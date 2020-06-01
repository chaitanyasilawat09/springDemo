package Setter_Injection.Dependency_Injection_Map_Collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientMapMain {
    public static void main(String[] args) {

        Resource res = new ClassPathResource("SI_Dependency_Injection_Map_Collection.xml");
        BeanFactory factory = new XmlBeanFactory(res);

        Object o = factory.getBean("mapBean");
        SampleBeanMap  beanMap = (SampleBeanMap)o;
        beanMap.showList();
        beanMap.showEmployees();
    }
}
