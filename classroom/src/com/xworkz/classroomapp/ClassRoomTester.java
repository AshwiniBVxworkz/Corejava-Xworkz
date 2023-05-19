package com.xworkz.classroomapp;
import java.util.Scanner;

public class ClassRoomTester {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
       String studentName=sc.next();
        System.out.println(" Enter Roll Number");
       int  rollNumber=sc.nextInt();
       ClassRoom student=new ClassRoom();

       student. setStudentName(studentName);

       student.setRollNumber(rollNumber);
       System.out.println("Student Name :"+student.getStudentName()+" "+"RollNumber :"+student.getRollNumber());

    }
}
