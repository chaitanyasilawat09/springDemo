package spring_ORM.spring_ORM2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeMain {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring_with_ORM/springWithORM");

        Object o = app.getBean("employeeDao");

        EmployeeDao dao=(EmployeeDao)o;

        Employee e=new Employee();
        e.setId(114);
        e.setName("varun");
        e.setSalary(50000);

        dao.saveEmployee(e);


    }
}
