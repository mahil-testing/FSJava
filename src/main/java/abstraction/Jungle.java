package abstraction;

public class Jungle {
    public static void main(String[] args) {
        Animal dog=new Dog(); //upcasting
        dog.eat();
        dog.walk(); //it print the behaviour of dog

        Animal cat=new Cat(); //upcasting
        cat.walk();
    }
}
