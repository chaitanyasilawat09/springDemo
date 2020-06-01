package life_Cycle_Method_Implementation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class SampleBean implements InitializingBean, DisposableBean {

    private String name;

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void destroy() throws Exception {

        System.out.println("inside destroy method");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("inside AfterPropertySe method");
    }

    public void printName(){
        System.out.println("inside printName method to print NAme :"+name);
    }
}


//TODO...........if we don't want to implement InitializingBean and DisposableBean so
//when we implements this so a=bean will be Heavy waight

//public class SampleBean implements InitializingBean, DisposableBean {

//    private String name;
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    //if we don't want to implement InitializingBean and DisposableBean so
//    //we can define our owm  method and in config.xml file
//    // define which is init method and which is destroy
//
//    TODO//<bean id="sample" class="Sample" init-method="methodName" destroy-method="methodName">

//    public void initMethod() throws Exception {
//
//       System.out.println("inside AfterPropertySe method");
//   }
//
//   public void destroyMethod(){
//        System.out.println("inside printName method to print NAme :"+name);
//    }

//    public void printName(){
//        System.out.println("inside printName method to print NAme :"+name);
//    }
//
//    TODO//if wa don't want to define in config.xml so we can use annotation to define
//    // Init and destroy method  in bean Class
//   TODO //@PostConstruct for init
//        //@PreDestroy for destroy on top of define method
//
////    @PostConstruct
//    public void initMethod() throws Exception {
//
//        System.out.println("inside AfterPropertySe method");
//    }
//
////    @PreDestroy
//    public void destroyMethod(){
//        System.out.println("inside printName method to print NAme :"+name);
//    }
//
//
//}
