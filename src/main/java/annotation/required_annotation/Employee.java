package annotation.required_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Employee {

    private int eno;
    private String name;
    private Information info;

    @Required
    public void setEno(int eno) {
        this.eno = eno;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public void setInfo(Information info) {
        this.info = info;
    }


    public void print() {
        System.out.println("Employee{" +
                "eno=" + eno +
                ", name='" + name + '\'' +
                ", info=" + info +
                '}');;
    }
}
