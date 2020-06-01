package bean_Autowiring.Autowire_byConstructor;

public class ExampleBean {

    private SampleBean sampleBean;

    ExampleBean(SampleBean sampleBean){
        this.sampleBean=sampleBean;
    }

    public void showExampleBean(){

        System.out.println("example bean method call");
        sampleBean.showSampleBean();
    }
}
