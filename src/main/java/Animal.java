public class Animal {
    String name;

    public void eat(){
        System.out.println(name+"Animal is eating"); //name is instance variable which inherit from Animal class
    }

    public Animal(String name){
        System.out.println("Animal Constructor Invoked");
        this.name=name;
    }
}
