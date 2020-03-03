package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void StudTest(){

        Student stud = new Student
                .Builder()
                .studNr("215025820")
                .studName("Joshua")
                .course("ND")
                .age(20)
                .year(2018)
                .build();

        Assert.assertEquals("Joshua", stud.getStudName());

    }
}