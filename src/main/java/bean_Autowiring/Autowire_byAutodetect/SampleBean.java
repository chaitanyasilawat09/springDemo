package bean_Autowiring.Autowire_byAutodetect;

public class SampleBean {

    private  String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showSampleBean() {

        System.out.println("showSample Bean method" +message);
    }
}
