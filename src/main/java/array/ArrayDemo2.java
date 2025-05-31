package array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] studentNames=new String[3];

        //scenario- if mention size 3 in array & initiate 4 values then error will come
        //initialization-set the value in an array
        studentNames[0]="Atul";
        studentNames[1]="Aman";
        studentNames[2]="Arav";
        studentNames[3]="Dilip"; //Index 3 out of bounds for length 3
    }
}
