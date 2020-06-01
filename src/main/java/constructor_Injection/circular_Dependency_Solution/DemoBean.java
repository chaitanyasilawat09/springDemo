package constructor_Injection.circular_Dependency_Solution;

public class DemoBean {

    SampleBean sampleBean;

     DemoBean(SampleBean sampleBean){
         this.sampleBean=sampleBean;
         System.out.println("DemoBean Constructor call to set SAmpleBEan object in DEMO_BEAN");
     }
}
