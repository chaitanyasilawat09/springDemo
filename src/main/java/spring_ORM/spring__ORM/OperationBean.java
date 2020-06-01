package spring_ORM.spring__ORM;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public class OperationBean {

    private HibernateTemplate ht;

    public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }

    public void saveStudent(Student s){
        ht.save(s);
    }

    public void loadAllStudents(){

      List list =  ht.loadAll(Student.class);
        list.stream().forEach(System.out::println);

    }
}
