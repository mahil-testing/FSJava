public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d=new Dog();
        System.out.println(d.name);//null
        d.getDetails(); //null

        Puppy p=new Puppy();
        System.out.println(p.name); //null
        p.getDetails(); //null
    }
}
