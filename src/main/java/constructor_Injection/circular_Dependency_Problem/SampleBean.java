package constructor_Injection.circular_Dependency_Problem;

public class SampleBean {

    DemoBean demoBean;

    public SampleBean(DemoBean demoBean) {
        this.demoBean = demoBean;
    }
}
