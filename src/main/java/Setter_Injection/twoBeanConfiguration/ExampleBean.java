package Setter_Injection.twoBeanConfiguration;

public class ExampleBean {
    private WelcomeBean wb;

    public void setWb(WelcomeBean wb) {
        this.wb = wb;
    }
    public void show(){
        wb.show();
        System.out.println("show method inside EXAMPLE_Bean ");
    }
}
