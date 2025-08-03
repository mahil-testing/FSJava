public class OperationDemo {
    public static void main(String[] args) {
        //1 Arithmetic operator-+, _, *, /
        int a=5;
        int b=8;
        int c=a+b;

        //2 Relational-compare two values, based on that it will return value
        if (a<b){
            System.out.println("Greater");
        }else{
            System.out.println("Lesser");
        }

        //3 Equality- compare two values & check both values are same or not
        if (a==b){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        //4 Equality operator with string class
        //String is a class, a new instance of String class getting created with value as Akhil
        String name="Akhil";
        if(name == "Akhil"){
            System.out.println("Equal");  //Equal
        }else{
            System.out.println("Not equal");
        }

        //5  Equality operator with string class object
        String name1=new String("Akhil");
        if(name1 == "Akhil"){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal"); //Not equal
        }

        //6 Compound Assignment
        int d=5;
        d=d+5;
        //0r
        d+=5;

        d=d-5;
        //or
        d-=5;
    }
}
