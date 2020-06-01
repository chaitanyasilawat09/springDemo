package life_Cycle_Method_Implementation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("life_Cycle_Method_Implementation.xml");

        Object obj = app.getBean("sample");
        SampleBean samp = (SampleBean)obj;
        samp.printName();

        //we have to explicitely close container otherwise destroy method never called
        app.close();
    }
}
