package bean_Autowiring.Autowire_byType;

public class ExampleBean {

    private  Example2 example2;

    public void setExample2(Example2 example2) {
        this.example2 = example2;
    }

    public void showExample(){
        System.out.println("inside example showExample().......");
        example2.showExample2();
    }
}
