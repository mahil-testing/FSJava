public class ClassRoom {

    //created array of students which hold 5 values but i purpose fully added 2
    Student[] students=new Student[5];


    //let say i am expecting input(int num) from user
    public int getStudentCount(int num){
        Student s1=new Student("Atul");
        Student s2=new Student("Ananya");
        //if divide anything by 0, it give infinity
        return students.length/num; //ArithmeticException
    }
}
