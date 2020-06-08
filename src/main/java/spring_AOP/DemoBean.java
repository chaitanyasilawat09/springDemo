package spring_AOP;

public class DemoBean implements DemoInterf {

    @Override
    public void m1(int a, String name) {

        System.out.println("inside DemoBean m1 method param a="+a+"..name="+name);

    }

    @Override
    public void m2(int a, String name) {

        System.out.println("inside DemoBean m2 method param a="+a+"..name="+name);


    }

    @Override
    public void hello() {

        System.out.println(" inside hello() method");
    }

    @Override
    public void by() {
        System.out.println(" inside by() method");

    }

    @Override
    public void getData() {

        System.out.println(" inside getData() method");

    }

    @Override
    public void getMyData() {

        System.out.println(" inside getMyData() method");

    }

    @Override
    public void byToYou() {

        System.out.println(" inside byToYou() method");
    }
}
