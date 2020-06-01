package Setter_Injection.twoBeanConfiguration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class twoBeanClient {

    public static void main(String[] args) {

        Resource res = new ClassPathResource("SI_TwoBeanConfig.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        //for first bean
        Object obj = factory.getBean("id1");
        SampleBean wb = (SampleBean)obj;
        wb.show();
        System.out.println("sample bean execution completed");

        // for second bean
        Object o= factory.getBean("id2");
        ExampleBean exampleBean = (ExampleBean)o;
        exampleBean.show();
        System.out.println("Example bean execution completed");


    }

}
