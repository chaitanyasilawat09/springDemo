package Setter_Injection.Dependency_Injection_Map_Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SampleBeanMap {

    private List data;
    private Map<String,Integer> employee;

    public void setEmployee(Map<String, Integer> employee) {
        this.employee = employee;
    }

    public void setData(List data) {
        this.data = data;
    }

    public void showList(){
        System.out.println("list data...........");
        data.stream().forEach(System.out::println);
        System.out.println("end list data .............");
    }

    public void showEmployees(){

        employee.entrySet().stream().forEach(System.out::println);
        System.out.println(".................");

        Set s = employee.entrySet();
        s.stream().forEach((System.out::println));

//        Iterator it = s.iterator();
//        while (it.hasNext()){
//            Map.Entry mape = (Map.Entry)it.next();
//            System.out.println(mape.getKey()+"....."+mape.getValue());
//        }
    }
}
