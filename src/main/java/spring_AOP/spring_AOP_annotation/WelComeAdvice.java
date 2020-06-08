package spring_AOP.spring_AOP_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

@Aspect
public class WelComeAdvice {

    // apply before advice on particular method "by()
    @Before("execution(* spring_AOP.spring_AOP_annotation.DemoBean.by(..))")
    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("inside before method @Before");
    }

    // apply before advice on All methods of bean
    @Before("execution(* spring_AOP.spring_AOP_annotation.*.*(..))")
    public void before1(JoinPoint joinPoint) throws Throwable {
        System.out.println("inside before1 method @Before");
    }



}
