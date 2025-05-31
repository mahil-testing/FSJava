package staticvariable;

public class AnimalDemo {
    public static void main(String[] args) {

        //call static variable
        System.out.println(Animal.a); //10

        //call static method
        Animal.eat();
    }
}
