package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        String expectedDob = "09/24/1984";
        String expectedEmail = "test@test.com";
        boolean expectedHasPets = true;
        boolean expectedIsSingle = false;
        int expectedWeight = 150;

        // When
        Person person = new Person(expectedName, expectedAge, expectedDob, expectedEmail,
                expectedHasPets, expectedIsSingle, expectedWeight);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualDob = person.getDob();
        String actualEmail = person.getEmail();
        boolean actualHasPets = person.getHasPets();
        boolean actualIsSingle = person.getIsSingle();
        int actualWeight = person.getWeight();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDob, actualDob);
        Assert.assertEquals(expectedEmail, actualEmail);
        Assert.assertEquals(expectedHasPets, actualHasPets);
        Assert.assertEquals(expectedIsSingle, actualIsSingle);
        Assert.assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetDob() {
        // Given
        Person person = new Person();
        String expected = "09/24/1984";

        //When
        person.setDob(expected);

        //Then
        String actual = person.getDob();
        Assert.assertEquals(expected, actual);
    }
}
