package upcastingdowncastingoverloadingoverriding;

public class Demo {
    public static void main(String[] args) {
        //1 If create instance of parent & assign it to parent & u try to access the
        // overridden method, parent version will run
        Calculator c1=new Calculator();
        c1.addition(5,6);  //parent
        c1.addition(5f,6); //parent
        c1.addition(); //parent

        //2 If create instance of child & assign it to child & u try to access the
        // overridden method, child version will run
        ScientificCalculator sc=new ScientificCalculator();
        sc.addition(5,6); //21 child override method
        sc.addition(); //parent
        sc.addition(6f,6); //parent
        sc.addition(8,9,"Akhil"); //child overloaded method

        //3 if create instance of child & assign it to parent, child version will run
        // upcasting-it means create instance of child & assign it to parent
        Calculator c2=new ScientificCalculator();
        c2.addition(); //parent
        c2.addition(5f,6); //parent
        c2.addition(5,6); //child 21

        //4 Downcasting-if create instance of child & assign it to child, child version of overridden method will run
        ScientificCalculator sc2=(ScientificCalculator)c2;
        sc2.addition(5,6); //child 21
    }
}
