package spring_AOP;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class WelComeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

        //we can perform any operation which we want to before method call
        // like balance check, Authentication,validation etc..

        System.out.println("                                             ");
        System.out.println("==========before===========================");
        System.out.println("inside befor method ");
        System.out.println("===========before==========================");
        System.out.println("                                             ");

    }
}
