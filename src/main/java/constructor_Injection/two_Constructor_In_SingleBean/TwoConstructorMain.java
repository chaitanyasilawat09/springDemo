package constructor_Injection.two_Constructor_In_SingleBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TwoConstructorMain {
    public static void main(String[] args) {

        Resource res = new ClassPathResource("CI_two_Constructor_In_SingleBean.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        Object o;
        o = factory.getBean("demoBean");
        DemoBean demoBean = (DemoBean)o;

        System.out.println(demoBean.getMessage());

         o = factory.getBean("demoBean1");
        DemoBean demoBean1 = (DemoBean)o;

        System.out.println(demoBean1.getuName());
        System.out.println(demoBean1.getPwd());
    }
}
