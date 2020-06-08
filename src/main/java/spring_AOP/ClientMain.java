package spring_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {

    public static void main(String[] args) {

        /*// TODO.use this when apply service on all methods
        ApplicationContext app = new ClassPathXmlApplicationContext("spring_AOP_XML/spring_Aop.xml");


        Object obj = app.getBean("proxyBeanFactory");

        //here proxyBeanFactory object will be generate
        //so we can not cast in into DemoBean
        //we have to call in into DemoInterf

        DemoInterf di = (DemoInterf)obj;
        di.m1(11,"slaw");
        di.m2(22,"Chait");
       */

        /*
        //TODO.use this when apply service through method Name point cut
        ApplicationContext app = new ClassPathXmlApplicationContext("spring_AOP_XML/spring_AOP_PointCut_nameMatcher");

        Object obj = app.getBean("proxyBeanFactory");

//        TODO here WelComeAdvice will call only before method which name start with 'by'

        DemoInterf di = (DemoInterf)obj;
         di.m1(11,"slaw");
         di.m2(22,"Chait");
         di.by();
         di.byToYou();
         di.getData();
         di.getMyData();
         di.hello();
        */

        //TODO.use this when apply service through Jdk RegularExperssion point cut
        ApplicationContext app = new ClassPathXmlApplicationContext("spring_AOP_XML/spring_AOP_PointCut_Regex");

        Object obj = app.getBean("proxyBeanFactory");

//        TODO here WelComeAdvice and GoodBye Advice will call only before some method
//         which name start satisfied RegularExpereeion

        DemoInterf di = (DemoInterf)obj;
        di.m1(11,"slaw");
        di.m2(22,"Chait");
        di.by();
        di.byToYou();
        di.getData();
        di.getMyData();
        di.hello();



    }
}
