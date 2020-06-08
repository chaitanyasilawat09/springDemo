package spring_AOP.all_Annotation;

public class OperationIMPL implements Operation {
    @Override
    public void msg() {

        System.out.println("inside msg meyhod of OperationIMPL ");

    }

    @Override
    public void test() {
        System.out.println("inside test meyhod of OperationIMPL ");

    }

    @Override
    public String printName(String name) {

      System.out.println("inside printName method of OperationIMPL, name= "+name);
        return name;
    }

    @Override
    public int printInt(Integer i) {

        System.out.println("inside printInt method of OperationIMPL, i= "+i);

        return i;
    }

    @Override
    public int printIntException(Integer i) {

        System.out.println("inside printInt method of OperationIMPL, i= "+i);
        if(i>200){
            throw new ArithmeticException("value if integer greater than 200");
        }
        else{
            System.out.println("good luck value is less than 200");
        }
        return i;
    }
}
