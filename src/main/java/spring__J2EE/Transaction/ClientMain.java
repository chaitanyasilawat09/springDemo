package spring__J2EE.Transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {

    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("spring__J2EE/transaction.xml");

        DemoBean db= (DemoBean)app.getBean("demoBean");
        db.m1();
    }
}
