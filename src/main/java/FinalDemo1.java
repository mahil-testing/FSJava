public class FinalDemo1 {
    final int a=10;

    public static void main(String[] args) {
        FinalDemo1 d1=new FinalDemo1();
        d1.m1();
    }
    public void m1(){
        //a++; //it show error because we can't change the value of final variable
        System.out.println(a); //10
    }
}
