package abstraction;

public abstract class Animal { //parent class

    //non abstract method
    public void eat(){
        System.out.println("Animal is eating");
    }

    //abstract method
    public abstract void walk();
}

