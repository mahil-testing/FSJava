package defaultvalue;

public class DefaultValueDemo {
    public int a;

    public void m1(){
        int age;
        System.out.println("age is "+'age); //age is showing error because age is local variable
                                           //java will not initialize the local variable

        System.out.println("a is "+a); //a does not give error because java will initialize
                                       // the default vale for instance variable
    }
}
