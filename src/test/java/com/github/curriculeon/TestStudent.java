package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    public boolean testImplementation() {
        //given
        Student student = new Student(1, "sdf");

        //when
        boolean isInstanceOfLearner = student instanceof ILearner;

        //then
        Assert.assertTrue(isInstanceOfLearner);
        return true;
    }
    @Test
    public void testImplementation1(){
        testImplementation();
    }

    @Test
    public void testImplementation2(){
        testImplementation();
    }

    public boolean testInheritance(){
        //given
        Student student = new Student(1,"sdf");

        //when
        boolean isInstanceOfPerson = student instanceof Person;

        //then
        Assert.assertTrue(isInstanceOfPerson);
        return true;
    }

    @Test
    public void testInheritance1(){
        testInheritance();
    }

    @Test
    public void testInheritance2(){
        testInheritance();
    }



    public void testLearn( double numberOfHours){
        //given
       // double totalStudyTime=0;
        double expectedTotalStudyTime = numberOfHours;
        Student student = new Student(34,"egf");

        //when
        student.learn(numberOfHours);
        double actualTotalStudyTime = student.getTotalStudyTime();

        //then
        Assert.assertEquals(expectedTotalStudyTime,actualTotalStudyTime,0);
    }

    @Test
    public void testLearn1(){
        testLearn(10);
    }
    @Test
    public void testLearn2(){
        testLearn(5.1);
    }
}
