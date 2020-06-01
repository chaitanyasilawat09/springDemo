package annotation.On_Setter;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    private String id;
    private String name;

    private Teacher teacher;


    public void setId(String id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    //this will work as byType autowire
    @Autowired
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void show(){
        System.out.println("name is :"+name+"....."+"id is :"+id);
        teacher.shoeTeacher();
    }
}
