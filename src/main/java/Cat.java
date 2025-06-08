public class Cat {
    public static void main(String[] args) {
        Animal2 lion=new Animal2("lion");
        Animal2 tiger=new Animal2("tiger");
        Animal2 fox=new Animal2("fox");

        //create Array of Animal Type & it hold 3 values
        Animal2[] animals=new Animal2[]{lion,tiger,fox};

        //for-each
        for(Animal2 n:animals){
            n.printDetails(); //lion tiger fox
        }
    }
}
