package printexception;

import trycatchfinallyRumTimeException.Student;

public class ClassRoom {
    Student[] students=new Student[5];
    public int getStudentCount(int num){
        int c=0;
        try {
            c = 5 / num;
            //i want to access the 6th index array which does not exist
            Student s=students[6]; //array index out of bond exception
            System.out.println("Line after exception occured");
        }catch(ArithmeticException e) {
            System.out.println("Handled  by arithmetic exception");
        }
        catch(RuntimeException e){
            System.out.println("Handled by run time");
            e.printStackTrace();
            c=20;
        }finally {
            System.out.println("finally block");
            c=30;
        }

        return c;
    }
}


