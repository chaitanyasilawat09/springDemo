package spring_ORM.spring__ORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("spring_with_ORM/springWithORM");

        Object o = app.getBean("operationBean");

        OperationBean ob = (OperationBean)o;

        Student s = new Student(101,"chait","PCM");

//        to save student we have to use FlusMode=commit
//        ob.saveStudent(s);

        ob.loadAllStudents();

    }
}
