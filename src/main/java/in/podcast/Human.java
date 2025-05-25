package in.podcast;

public class Human {
    public String name="Human";
    private int age=45;

    //we can create object of Animal class, because Animal is public class
    Animal a =new Animal();
    public void eat(){
        System.out.println("Animal is eating");
    }
    private void getDetails(){
        System.out.println(name+" : "+age);
    }
}

