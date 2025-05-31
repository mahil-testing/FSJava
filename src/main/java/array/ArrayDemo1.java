package array;

public class ArrayDemo1 {
    public static void main(String[] args) {

        //scenario-1
        //Declaration-create an array
        String[] studentNames=new String[3];

        //initialization-set the value in an array
        studentNames[0]="Atul";
        studentNames[1]="Aman";
        studentNames[2]="Arav";

        //get the value from index1
        System.out.println(studentNames[1]); //Aman

        //scenario-2
        //Alternative way of Declaration+initialization in single line
        String[] studentNam=new String[]{"shivam","Rajat","divesh"};

        //get the value from index2
        System.out.println(studentNam[2]);
    }
}
