package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void test(){
        //given
        Student student = new Student(0,"student0");
        //when
        Students students = Students.getINSTANCE();
        boolean isContains = students.contains(student);
        //then
        Assert.assertTrue(isContains);

    }
}
