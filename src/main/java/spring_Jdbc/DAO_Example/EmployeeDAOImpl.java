package spring_Jdbc.DAO_Example;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class EmployeeDAOImpl implements  EmployeeDAO{

    private JdbcTemplate jt;

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    @Override
    public int insertEmployee(Employee e) {

        int id = e.getId();
        String name = e.getEname();
        int sal = e.getEsal();
        String dept = e.getDept();

        Object[] param = {id,name,sal,dept};
        int k= jt.update("insert into employee values(?,?,?,?)",param);

        return k;
    }

    @Override
    public void selectAllEmployee() {

//        to print data with metadata
//     List l=   jt.queryForList("select * from employee");

//        to print data but not metadata
        List l=jt.query("select * from employee",new EmployeeRowMapper());
     l.stream().forEach(System.out::println);
    }

    @Override
    public int updateEmployee(int esal, int eid) {

        Object[] param = {esal,eid};
        String updateQuery = "update employee set esal=? where eid=?";

        int k =  jt.update(updateQuery,param);
        return k;
    }

    @Override
    public void deleteEmployee(String ename) {

        jt.update("delete from employee where eame=?",ename);


    }
}
