package constructor_Injection.singleBean;

public class DemoBean {

    private  String message;

    DemoBean(String message){
        this.message=message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage(){
        System.out.println("message is ."+message);
    }

}
