package spring_ORM.spring_ORM2;

import org.hibernate.FlushMode;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

public class EmployeeDao {

    HibernateTemplate template;
    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    public HibernateTemplate getTemplate() {
        return template;
    }


    public void saveEmployee(Employee e){

        getTemplate().getSessionFactory().getCurrentSession().setFlushMode(FlushMode.COMMIT);
        template.save(e);
    }
    //method to update employee
    public void updateEmployee(Employee e){
        template.update(e);
    }
    //method to delete employee
    public void deleteEmployee(Employee e){
        template.delete(e);
    }
    //method to return one employee of given id
    public Employee getById(int id){
        Employee e=(Employee)template.get(Employee.class,id);
        return e;
    }
    //method to return all employees
    public List<Employee> getEmployees(){
        List<Employee> list=new ArrayList<Employee>();
        list=template.loadAll(Employee.class);
        return list;
    }
}