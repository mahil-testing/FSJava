package throwsexception;

public class School {
    public static void main(String[] args) {
        ClassRoom cr=new ClassRoom();
        try {
            cr.getStudentCount(0);
        }
        catch(Exception e){
            System.out.println("exception occured");
        }
    }
}

