package overloadingmultipleclass;

public class ScientificCalculator extends Calculator {
    public int addition(int a, int b, String s){
        System.out.println("value is "+s); //value is Akhil
        int c=a+b;
        System.out.println("value of c is "+c); //value of c is 30
        return c;
    }
}
