package Setter_Injection.First_singleBeanConfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

    public static void main(String[] args) {

        Resource res = new ClassPathResource("SI_config.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        Object obj = factory.getBean("id1");
        WelcomeBean wb = (WelcomeBean)obj;
        wb.show();

    }

}
