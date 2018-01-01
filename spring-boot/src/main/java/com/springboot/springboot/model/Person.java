package com.springboot.springboot.model;

/**
 * Created by chaitanyaprashar on 31/12/2017.
 */
public class Person {

    private String id;
    private String firstNmame;
    private String lastName;
    private int age;

    public Person(String id, String firstName, String lastName, int age)
    {
        this.id = id;
        this.age = age;
        this.firstNmame =firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstNmame() {
        return firstNmame;
    }

    public void setFirstNmame(String firstNmame) {
        this.firstNmame = firstNmame;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
