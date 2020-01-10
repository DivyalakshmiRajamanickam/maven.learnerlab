package com.github.curriculeon;

import com.github.curriculeon.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestPeople {
    //given
    public void testAdd(Person valuesToBePopulatedWith) {
        //given
        People people = new People();

        //when
        people.add(valuesToBePopulatedWith);

        // then
        boolean containsPerson = people.contains(valuesToBePopulatedWith);
        Assert.assertTrue(containsPerson);
    }

    @Test
    public void testAdd1 () {
        Person valuesToBePopulated =  new Person(1,"d");
        testAdd(valuesToBePopulated);
    }


}