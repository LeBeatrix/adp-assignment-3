package org.example;

public class StudentIIInheritance extends StudentII{

    public static void main(String[] args) {


        StudentII student = new StudentII();


        student.setStudNr("215025820");
        student.setStudName("Joshua");
        student.setCourse("ND");
        student.setAge(20);
        student.setYear(2018);

        System.out.println("----Student Details---");
        System.out.println("Student Number:\t" + student.getStudNr());
        System.out.println("Student Name:\t" + student.getStudName());
        System.out.println("Course:\t" + student.getCourse());
        System.out.println("Student age:\t" + student.getAge());
        System.out.println("Year studied:\t" + student.getYear());

    }
}
