package spring_AOP.all_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OperationMain {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring_AOP_XML/all_Annotation");

        Operation op = (Operation)app.getBean("operation");
        op.msg();
        op.printInt(100);
        op.printName("Chaitanya");
        op.test();

//        TODO this method only used for AfterThrowing Advice

        op.printIntException(100);
        op.printIntException(201);
    }
}
