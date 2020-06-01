package annotation.On_BeanObject_Student_Profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {

    //it work like as ByName autowire
    @Autowired
    @Qualifier("std2")
    private Student student;

    public Profile() {
        System.out.println("no arg constructor Profile class");
    }

    public void printAge(){
        System.out.println("student Id is :"+student.getId());
    }

    public void printName(){
        System.out.println("student name is : "+student.getName());
    }
}
