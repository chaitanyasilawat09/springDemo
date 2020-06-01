package constructor_Injection.circular_Dependency_Solution;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientMain {

    public static void main(String[] args) {

        Resource resource = new ClassPathResource("CI_circular_Dependency_Solution.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Object obj = factory.getBean("sample");
        SampleBean sb = (SampleBean)obj;
        System.out.println(sb.toString()+".....sample bean object");

//        Object obj1 = factory.getBean("demo");
//        DemoBean sb1 = (DemoBean)obj1;
//        System.out.println(sb1.toString()+".....demo bean object");

    }
}
