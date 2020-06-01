package bean_Autowiring.Autowire_byAutodetect;

public class ExampleBean {

    private SampleBean sampleBean;

    public ExampleBean(SampleBean sampleBean) {
        System.out.println("example bean constructor call");
        this.sampleBean = sampleBean;
    }

    // if we remove ExampleBean constructor so we not get any error
    // bcoz autodetect first look for constructor
    //then look like as byType
    //we use setter for sampleBean property

//    public void setSampleBean(SampleBean sampleBean) {
//        System.out.println("test");
//        this.sampleBean = sampleBean;
//    }

    public void showExampleBean(){
        System.out.println("exampleBean show method");
        sampleBean.showSampleBean();
    }
}
