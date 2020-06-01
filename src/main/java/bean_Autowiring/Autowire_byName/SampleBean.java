package bean_Autowiring.Autowire_byName;

public class SampleBean {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showSampleBEan() {

        System.out.println("SampleBEan show method:   "+message);
    }
}
