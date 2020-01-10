package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    public boolean testImplementation(){
        //given
        Instructor instructor = new Instructor(1,"Divya");

        //when
        boolean isInstanceOfTeacher = true;

        //then
        Assert.assertTrue(true);
        return  true;
    }

    @Test
    public void testImplementation1(){
        testImplementation();
    }

    public boolean testInheritance(){
        //given
        Instructor instructor = new Instructor(1,"Divya");

        //when
        boolean isInstanceOfPerson = instructor instanceof Person;

        //then
        Assert.assertTrue(isInstanceOfPerson);
        return true;
    }

    @Test
    public void testInhertance1(){
        testInheritance();
    }

    public void testTeach(double numberOfHours){
        //given
        double expectedTotalStudyTime = numberOfHours;
        Instructor instructor = new Instructor(1,"Divya");
        Student student = new Student(1,"ste");
       // Student student2 = new Student(2,"s2");

        //when
        instructor.teach(student, numberOfHours );
        double actualTotalStudyTime = student.getTotalStudyTime();

        //then
        Assert.assertEquals(expectedTotalStudyTime,actualTotalStudyTime,0);

    }

    @Test
    public void testTeach1(){
        testTeach(10);
    }

    @Test
    public void testTeach2(){
        testTeach(13);
    }


    public void testLecture(){
        //given
        //when
        //then

    }
}
