package spring_Jdbc.stored_Procedure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_JDBC/stored_Procedure");

        Object object = ctx.getBean("demoBean");

        DemoBean db = (DemoBean)object;

        db.executePro(101);



    }
}
