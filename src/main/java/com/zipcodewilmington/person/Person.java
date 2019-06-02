package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String street;
    private String town;
    private String state;
    private String zipCode;
    private String phone;
    private String eMail;


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.name = "";
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.age = Integer.MAX_VALUE;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String street, String town, String state, String zipCode) {
        this.street = street;
        this.town = town;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Person(String phone, String eMail) {
        this.phone = phone;
        this.eMail = eMail;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return this.street;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getTown() {
        return this.town;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setZipcode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipcode() {
        return this.zipCode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    public String getEmail() {
        return this.eMail;
    }


}
