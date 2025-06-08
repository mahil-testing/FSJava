public class Jungle {
    public static void main(String[] args) {
        Animal lion=new Animal("lion");
        Animal tiger=new Animal("tiger");
        Animal fox=new Animal("fox");

        //create Array of Animal Type & it hold 3 values
        Animal[] animals=new Animal[]{lion,tiger,fox};

        //for-each
        for(Animal n:animals){
            System.out.println(n.name); //lion, tiger,fox
        }
    }
}
