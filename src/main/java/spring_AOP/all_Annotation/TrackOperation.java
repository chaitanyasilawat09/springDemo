package spring_AOP.all_Annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class TrackOperation {

//    TODO ========================Before Advice=================================
    @Before("execution(* Operation.*(..))")
    public void beforeAdvice(JoinPoint jp){

        System.out.println("beforeAdvice");
//        TODO to get method name
        System.out.println(jp.getSignature().getName());
        // TODO to get method signature
        System.out.println(jp.getSignature());
        System.out.println("============================");
    }
    //    TODO ========================After Advice=================================
    @After("execution(* Operation.*(..))")
    public void afterAdvice(){

        System.out.println("after Advice");
        System.out.println("===============================");
    }

    //    TODO ========================Around Advice=================================
    @Around("execution(* spring_AOP.all_Annotation.OperationIMPL.print*(..))")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("start Around advice");
        Object o = pjp.proceed();
        System.out.println("end around advice");
        //TODO use return o; ,otherwise get error when call int return method like printInt(Int)
        return o;

    }

    //    TODO ========================AfterReturning Advice=================================

    @AfterReturning(value = "execution(* spring_AOP.all_Annotation.OperationIMPL.print*(..))",
                    returning = "result")
    public void afterReturningAdvice(JoinPoint jp, Object result){

        System.out.println("START afterReturningAdvice ");
        System.out.println("result inside Result= "+result);
        System.out.println("END afterReturningAdvice ");
    }



//    TODO ========================AfterThrowing Advice=================================

    @AfterThrowing(value = "execution(* spring_AOP.all_Annotation.OperationIMPL.printIntException*(..))",
                   throwing = "error")
    public void afterThrowingAdvice(JoinPoint jp,Throwable error){

        System.out.println("                               ");
        System.out.println("inside afterThrowingAdvice");
        System.out.println("exception insdie "+jp.getSignature());
        System.out.println("Exception is "+error);

    }


//    TODO ========================Before Advice=================================
//    //    TODO we can also use tile this
//    @Pointcut("execution(* Operatioon.*(..))")
//    public void pointCutNmae(){}
//
//    @Before("pointCutNmae()")
//    public void beforePointCutStyle(){
//        System.out.println("inside beforePointCutStyle");
//    }



}
