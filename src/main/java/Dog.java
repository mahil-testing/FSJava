public class Dog extends Animal {

    public void walk(){
        System.out.println(name+"Animal is walking");
    }

    public Dog(String name){ //name local variable value comes from object of dog class
        super(name); //super keyword should be written in first line
        System.out.println("Dog constructor invoked");
    }
}
