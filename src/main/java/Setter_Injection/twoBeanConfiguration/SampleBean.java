package Setter_Injection.twoBeanConfiguration;

public class SampleBean {
    private WelcomeBean wb;

    public void setWb(WelcomeBean wb) {
        this.wb = wb;
    }
    public void show(){
        wb.show();
        System.out.println("show method inside SAMPLE_Bean");
    }
}
