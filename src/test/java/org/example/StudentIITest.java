package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentIITest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void StudTest(){

        StudentII student = new StudentII();


        student.setStudNr("215025820");
        student.setStudName("Joshua");
        student.setCourse("ND");
        student.setAge(20);
        student.setYear(2018);

        Assert.assertEquals("Joshua", student.getStudName());

    }
}