package bean_Validation;

import java.util.List;

public class Subject {

    private List subjects;

    public void setSubjects(List subjects) {
        this.subjects = subjects;
    }

    public void subjectName(){
        System.out.println("subject is ");
        subjects.stream().forEach(System.out::println);
    }
}
