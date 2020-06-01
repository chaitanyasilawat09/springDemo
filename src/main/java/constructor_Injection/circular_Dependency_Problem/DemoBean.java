package constructor_Injection.circular_Dependency_Problem;

public class DemoBean {

    SampleBean sampleBean;

    public DemoBean(SampleBean sampleBean) {
        this.sampleBean = sampleBean;
    }
}
