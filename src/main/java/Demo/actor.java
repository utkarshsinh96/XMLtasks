package com.stackroute.demo.Demo;

public class actor {

    private String name;
    private String gender;
    private int age;

    public actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public actor() {

    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Age: " + this.age);
    }



}