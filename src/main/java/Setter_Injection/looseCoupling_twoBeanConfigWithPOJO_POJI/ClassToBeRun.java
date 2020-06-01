package Setter_Injection.looseCoupling_twoBeanConfigWithPOJO_POJI;

import Setter_Injection.looseCoupling_twoBeanConfigWithPOJO_POJI.Interface.Journy;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClassToBeRun {

    public static void main(String[] args) {

        // use to load parent config file

        Resource resource = new ClassPathResource("SI_parentConfig.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        // use to load chile config file and to load parent container inside child
        //we pass parent container inside child container XmlBeanFactory(resource1,factory)

        Resource resource1 = new ClassPathResource("SI_childConfig.xml");
        BeanFactory factory1 = new XmlBeanFactory(resource1,factory);

        Object object = factory1.getBean("id3");
        Journy journy = (Journy)object;
        journy.startjourny();

    }
}
