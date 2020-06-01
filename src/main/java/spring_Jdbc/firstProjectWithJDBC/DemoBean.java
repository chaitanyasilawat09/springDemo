package spring_Jdbc.firstProjectWithJDBC;

import org.springframework.jdbc.core.JdbcTemplate;

public class DemoBean {

    private JdbcTemplate jt;

    public DemoBean(JdbcTemplate jt) {
        this.jt = jt;
    }

    public void createTable() {

        jt.execute("CREATE TABLE employee (LastName varchar(255),FirstName varchar(255)," +
                "Address varchar(255),City varchar(255) );");
        System.out.println("table Cteated");
    }

    public void insertRowData(){

        jt.update(" insert into  employee values " +
                "('kumawat','AAyu','silawato ka was', 'ratlamcity');");

        System.out.println("data inserted onto row");
    }


}
