package overloadingsingleclass;

public class Demo {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.addition();
        c1.addition(1,2);
        c1.addition(10,3);
        //c1.addition(1,2,3);//giving compile time error because we can't access
                                    // private method from different class
    }
}
