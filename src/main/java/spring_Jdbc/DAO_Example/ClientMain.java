package spring_Jdbc.DAO_Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {
    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("spring_JDBC/Spring_jdbc_DAO_Example");

        Object obj = app.getBean("demoBean");

        DemoBean db = (DemoBean)obj;

        Employee e = new Employee();
        e.setId(10033);
        e.setEname("slaw");
        e.setEsal(4000);
        e.setDept("test");

        Employee employee = new Employee();
        employee.setId(10022);
        employee.setEname("chait");
        employee.setEsal(2000);
        employee.setDept("JAVA dev");

        db.insertEmployee(e);
        db.insertEmployee(employee);

        db.selectEmployee();
        db.modifyEmployee(10011,6000);

//      db.deleteEmployee("aayu");
        db.selectEmployee();
    }
}
