package Setter_Injection.Dependency_Injection_List_Collection;

import java.util.List;

public class DataBean {
    public void setList(List list) {
        this.list = list;
    }

    private List<Integer> list;



    @Override
    public String toString() {
        for (int i=0;i<=5;i++){
            list.add(i);
        }
        return "DataBean{" +
                "list=" + list +
                '}';
    }
}
