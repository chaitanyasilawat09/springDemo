package Setter_Injection.twoBeanConfiguration;//public class Student {
//
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void displayInfo(){
//        System.out.println("hello: "+name);
//    }
//
//
//}

public class WelcomeBean {

    private String message;
    public WelcomeBean() {	}

    public void setMessage(String message) {

        this.message= message;
    }

    public void show() {
        System.out.println( " your message for SI_config.xml file is......"+message);

    }


}
