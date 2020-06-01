package annotation.On_BeanObject_Student_Profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("annotation_student_profile");

        Object obj = app.getBean("profile");
        Profile profile = (Profile)obj;
        profile.printName();
        profile.printAge();

        //if we want student2 detail so set
        //@Qualifier("student2")
        //name should be same as in config.xml file

        System.out.println(app.getApplicationName().toString());
        System.out.println(app.getDisplayName().toString());
        System.out.println(app.getId());
        System.out.println(app.getParent());
        System.out.println(app.getStartupDate());
        System.out.println(app.getAutowireCapableBeanFactory());
    }
}
