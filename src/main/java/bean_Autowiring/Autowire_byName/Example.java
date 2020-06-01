package bean_Autowiring.Autowire_byName;

public class Example {

    private SampleBean sb;

    public void setSb(SampleBean sb) {
        this.sb = sb;
    }

    public void showExampleBean(){

        System.out.println("ExampleBEan show method");
        sb.showSampleBEan();
    }
}
