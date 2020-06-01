package Setter_Injection.twoBeanConfiguration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TwoBeanConfigByRefTag {
    public static void main(String[] args) {

        Resource resource = new ClassPathResource("SI_twoBeanConfigByRef.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Object object = factory.getBean("id1");
        SampleBean sb = (SampleBean)object;
        sb.show();

        Object object1 = factory.getBean("id2");
        ExampleBean eb = (ExampleBean)object1;
        eb.show();
    }
}
