package constructor_Injection.circular_Dependency_Solution;

public class SampleBean {

    DemoBean demoBean;

    public void setDemoBean(DemoBean demoBean) {
        this.demoBean = demoBean;
        System.out.println("setDemoBean call to set Demobean object in SAMPLEBEAN");
    }


}
