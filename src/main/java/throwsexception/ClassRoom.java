package throwsexception;
public class ClassRoom {

    public int getStudentCount(int num){
        int c=0;
            c = 5 / num;

            System.out.println("Line after exception occured");


        return c;
    }
}


