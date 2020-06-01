package constructor_Injection.Combinatoin_Of_Setter_Constructor_Injection;

public class DemoBean {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public DemoBean(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "DemoBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
