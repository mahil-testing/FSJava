public class FinalDemo2 {
    final int d=0;

    public static void main(String[] args) {
        FinalDemo2 d1=new FinalDemo2();
        d1.m1(5,6);
    }
    public void m1(final int a, final int b){
        final int c=7;
        System.out.println(a+b+c+d); //5+6+7+0=18
    }
}
