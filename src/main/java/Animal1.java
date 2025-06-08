public class Animal1 {
    String name;

    public Animal1(String name){
        System.out.println(this.name); //null
        System.out.println(name); //lion

        this.name=name;
        System.out.println(this.name); //lion
        System.out.println(name); //lion
    }
}
