package constructor_Injection.circular_Dependency_Problem;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientMain {
    public static void main(String[] args) {

        Resource resource = new ClassPathResource("CI_circular_Dependency_Problem");
        BeanFactory factory = new XmlBeanFactory(resource);

        Object o = factory.getBean("sample");
        SampleBean sb = (SampleBean)o;

        //when run this got an exception -: BeanCurrentlyInCreationException:
        // Error creating bean with name 'sample': Requested bean is currently in creation:
        // Is there an unresolvable circular reference?
        System.out.println(sb);
    }
}
