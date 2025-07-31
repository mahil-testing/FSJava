package trycatchfinallyRumTimeException;


import trycatchfinallywithoutexception.ClassRoom;

public class School {
    public static void main(String[] args) {
        trycatchfinallywithoutexception.ClassRoom cr=new ClassRoom();
        int count=cr.getStudentCount(2);
        System.out.println(count);
    }
}

