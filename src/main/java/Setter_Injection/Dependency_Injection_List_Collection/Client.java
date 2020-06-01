package Setter_Injection.Dependency_Injection_List_Collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
    public static void main(String[] args) {

        Resource res = new ClassPathResource("SI_dependency_Injection_List_Collection.xml");
        BeanFactory factory = new XmlBeanFactory(res);

        Object o = factory.getBean("id1");
        SampleListBean sb = new SampleListBean();
        sb.showList();
    }
}
