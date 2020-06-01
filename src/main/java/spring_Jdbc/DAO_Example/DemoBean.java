package spring_Jdbc.DAO_Example;

public class DemoBean {

    private EmployeeDAO dao;

    public void setDao(EmployeeDAO dao) {
        this.dao = dao;
    }

    public int insertEmployee(Employee e){
        int k = dao.insertEmployee(e);
        return k;
    }

    public void selectEmployee(){

        dao.selectAllEmployee();
    }

    public int modifyEmployee(int esal,int eid){

        int k = dao.updateEmployee(esal,eid);
        return k;
    }

    public void deleteEmployee(String ename){

        dao.deleteEmployee(ename);

    }
}
