package trycatchfinallywithoutexception;

public class ClassRoom {

    public int getStudentCount(int num){
        int c=0;
        try {
            c = 5 / num;
            System.out.println("Line after exception occured");
        }catch(ArithmeticException e) {
            System.out.println("Handled  by arithmetic exception");
        }
        catch(RuntimeException e){
        System.out.println("Handled by run time");
        c=20;
        }finally {
            System.out.println("finally block");
            c=30;
        }

        return c;
    }
}

