package Setter_Injection.Dependency_Injection_Set_Collection;

import java.util.Set;

public class SampleBean {

    private Set data;

    public void setData(Set data) {
        this.data = data;
    }

    public void show(){

        System.out.println(data.toString()+"......to String");
        data.stream().forEach(System.out::println);


    }

}
