package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    //given

    public void testConstructor(String expectedName, long expectedId){
        //given
        Person person = new Person(expectedId,expectedName);

        //when
        String actualName = person.getName();
        long actualId = person.getId();

        //then
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedId,actualId);
    }

    @Test
    public void testConstructor1(){
        testConstructor("divya",23);
    }
    @Test
    public void testConstructor2(){
        testConstructor("dffdg",23);
    }

    public void testSetName(String name){
        //given
        String expectedName = name;
        Person person = new Person(43,null);

        //when
        person.setName(name);
        String actualName = person.getName();

        //then
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void testSetName1() {
        testSetName("Divya");
    }
    @Test
    public void testSetName2() {
        testSetName("Paraki");
    }

    }
//
//
