package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentII
{

    private String studNr;
    private String studName;
    private String course;
    private int age;
    private int year;

    public StudentII(){}

    public StudentII(String studNr, String studName, String course, int age, int year)
    {
        this.studNr = studNr;
        this.studName = studName;
        this.course = course;
        this.age = age;
        this.year = year;
    }

    public String getStudNr()
    {
        return studNr;
    }

    public void setStudNr(String studNr)
    {
        this.studNr = studNr;
    }

    public String getStudName()
    {
        return studName;
    }

    public void setStudName(String studName)
    {
        this.studName = studName;
    }

    public String getCourse()
    {
        return course;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static List<StudentII> getStudDetails()
    {
        ArrayList<StudentII> Stud = new ArrayList<StudentII>();
        Stud.add(new StudentII("215025830","Lene", "ND", 19 , 2018));
        Stud.add(new StudentII("215025820", "Joshua", "ND", 20, 2018));
        Stud.add(new StudentII("215025810", "Blue", "ND", 21, 2019));
        return Stud;
    }

}
