package spring_AOP;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class GoodByeAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

        System.out.println("                                             ");
        System.out.println("============afterReturning=========================");
        System.out.println("inside afterReturning method");
        System.out.println("============afterReturning=========================");
        System.out.println("                                             ");

    }
}
