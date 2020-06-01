package spring_Jdbc.DAO_Example;

public interface EmployeeDAO {

    public int insertEmployee(Employee e);

    public void selectAllEmployee();

    public int updateEmployee(int esal,int eid);

    public void deleteEmployee(String ename);
}
