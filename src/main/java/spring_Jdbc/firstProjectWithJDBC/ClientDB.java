package spring_Jdbc.firstProjectWithJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDB {

    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("spring_JDBC/firstProjectWithJDBC.xml");

        Object obj = app.getBean("dataBean");

        DemoBean db = (DemoBean)obj;

//        db.createTable();
        db.insertRowData();
    }
}
