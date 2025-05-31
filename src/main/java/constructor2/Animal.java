package constructor2;

public class Animal {
    private String name;
    private int id;

    public Animal(String animalName, int animalId){
        name=animalName;
        id=animalId;
    }
    public void getDetails(){
        System.out.println("Name is "+name+", id is: "+id);
    }
}
