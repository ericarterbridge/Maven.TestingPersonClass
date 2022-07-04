package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String dob;
    private String email;
    private boolean hasPets;
    private boolean isSingle;
    private int weight;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.dob = "";
        this.email = "";
        this.hasPets = true;
        this.isSingle = true;
        this.weight = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, String dob, String email, boolean hasPets, boolean isSingle, int weight) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
        this.hasPets = hasPets;
        this.isSingle = isSingle;
        this.weight = weight;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHasPets(boolean hasPets) {
        this.hasPets = hasPets;
    }

    public void setIsSingle(boolean isSingle) {
        this.isSingle = isSingle;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return this.dob;
    }

    public String getEmail() {
        return this.email;
    }

    public Boolean getHasPets() {
        return this.hasPets;
    }

    public Boolean getIsSingle() {
        return this.isSingle;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public String getName() {

        return this.name;
    }

    public Integer getAge() {

        return this.age;
    }
}
