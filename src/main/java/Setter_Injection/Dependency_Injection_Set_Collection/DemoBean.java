package Setter_Injection.Dependency_Injection_Set_Collection;

public class DemoBean {

    private int i;

    public void setI(int i) {
        this.i = i;
    }
    public void shows(){
        System.out.println("inside DemoBEan show method.."+i);
    }

    @Override
    public String toString() {
        return "DemoBean{" +
                "i=" + i +
                '}';
    }
}
