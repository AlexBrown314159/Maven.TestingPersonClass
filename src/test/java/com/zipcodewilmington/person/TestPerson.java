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

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
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
    public void testConstructorWithAddress() {
        // Given
        Person person = new Person();
        String expectedStreet = "1600 Pennsylvania Avenue NW";

        // When
        person.setStreet(expectedStreet);

        // Then
        String actual = person.getStreet();
        Assert.assertEquals(expectedStreet, actual);
    }

    @Test
    public void testSetAddress() {
        // Given
        Person person = new Person();
        String expectedStreet = "1600 Pennsylvania Avenue NW";
        String expectedTown = "Washington";
        String expectedState = "DC";
        String expectedZipcode = "20050";

        // When
        person.setStreet(expectedStreet);
        person.setTown(expectedTown);
        person.setState(expectedState);
        person.setZipcode(expectedZipcode);

        // Then
        String actualStreet = person.getStreet();
        String actualTown = person.getTown();
        String actualState = person.getState();
        String actualZipcode = person.getZipcode();

        Assert.assertEquals(expectedStreet, actualStreet);
        Assert.assertEquals(expectedTown, actualTown);
        Assert.assertEquals(expectedState, actualState);
        Assert.assertEquals(expectedZipcode, actualZipcode);

    }

    @Test
    public void testConstructorWithCommunication() {
        // Given
        String expectedPhone = "(202) 456-1111";
        String expectedEmail = "president@whitehouse.gov";

        // When
        Person person = new Person(expectedPhone, expectedEmail);

        // Then
        String actualPhone = person.getPhone();
        String actualEmail = person.getEmail();
        Assert.assertEquals(expectedPhone, actualPhone);
        Assert.assertEquals(expectedEmail, actualEmail);
    }

    @Test
    public void testSetCommunication() {
        // Given
        Person person = new Person();
        String expectedPhone = "(202) 456-1111";
        String expectedEmail = "president@whitehouse.gov";

        // When
        person.setPhone(expectedPhone);
        person.setEmail(expectedEmail);

        String actualPhone = person.getPhone();
        String actualEmail = person.getEmail();

        // Then
        Assert.assertEquals(expectedPhone, actualPhone);
        Assert.assertEquals(expectedEmail, actualEmail);
    }

}
