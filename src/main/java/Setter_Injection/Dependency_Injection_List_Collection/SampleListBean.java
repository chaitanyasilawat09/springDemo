package Setter_Injection.Dependency_Injection_List_Collection;

import java.util.List;

public class SampleListBean {

    private List stringList;

    public void setStringList(List stringList) {
        this.stringList = stringList;
    }

    public void showList(){

        System.out.println("showList method");
        stringList.stream().forEach(System.out::println);
    }
}
