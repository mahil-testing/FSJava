package upcastingdowncastingoverloadingoverriding;

public class ScientificCalculator extends Calculator{
    public int addition(int a, int b, String s){ //overloaded method
        System.out.println("s value is "+s);
        return a+b;
    }
    public int addition(int a, int b){ //overrided method
        int c=a+b+10;
        System.out.println(c);
        return c;
    }

}
