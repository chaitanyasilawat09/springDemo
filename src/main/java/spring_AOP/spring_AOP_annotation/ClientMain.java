package spring_AOP.spring_AOP_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {

    public static void main(String[] args) {

       // TODO.use this when apply service on all methods
        ApplicationContext app = new ClassPathXmlApplicationContext("spring_AOP_XML/spring_AOP_annotation");


        Object obj = app.getBean("demoBean");

        //here proxyBeanFactory object will be generate
        //so we can not cast in into DemoBean
        //we have to call in into DemoInterf

        DemoInterf di = (DemoInterf) obj;
        di.m1(11,"slaw");
        di.by();





    }
}
