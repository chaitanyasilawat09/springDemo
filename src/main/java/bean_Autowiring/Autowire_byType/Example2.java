package bean_Autowiring.Autowire_byType;

public class Example2 {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void showExample2(){
        setMessage("from Example2 set message ");
        System.out.println("message is :"+message);
    }
}
