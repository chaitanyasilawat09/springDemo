package bean_Validation;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Student {

    private int a,b;
    @Autowired
    private Subject subject;
    private List Data;

    public void setData(List data) {
        Data = data;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public  void displayPrimitives(){
        System.out.println(a+ "......value of A");
        System.out.println(b+ "......value of B");
    }

    public void listData(){
        Data.stream().forEach(System.out::println);
    }

    public void subjectName() {
        System.out.println("inside student subject name method");
       subject.subjectName();
    }
}


