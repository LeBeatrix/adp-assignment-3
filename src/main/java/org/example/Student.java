package org.example;

import java.util.Objects;

public class Student {

    public static void main( String[] args )
    {
        System.out.println( "Student Details." );
    }

    private String studNr;
    private String studName;
    private String course;
    private int age;
    private int year;

    public Student(){}

    public String getStudNr() {
        return studNr;
    }

    public String getStudName() {
        return studName;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    public int getYear() {
        return year;
    }

    public Student(Builder builder){


        this.studNr = builder.studNr;
        this.studName = builder.studName;
        this.course = builder.course;
        this.age = builder.age;
        this.year = builder.year;
    }

    public static class Builder {

        private String studNr;
        private String studName;
        private String course;
        private int age;
        private int year;

        public Builder studNr(String value) {
            this.studNr = value;
            return this;
        }

        public Builder studName(String value) {
            this.studName = value;
            return this;
        }

        public Builder course(String value) {
            this.course = value;
            return this;
        }

        public Builder age(int value) {
            this.age = value;
            return this;
        }

        public Builder year(int value) {
            this.year = value;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public void listDetails(){

        System.out.println("Student ID:"+studNr);
        System.out.println("Student Name:\t" +getStudName());
        System.out.println("Course:\t" +course);
        System.out.println("Student Age:\t" +age);
        System.out.println("Year Attend:\t" +year);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student stud = (Student) o;
        return studNr.equals(stud.studNr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studNr);
    }


}

