package com.stackroute.domain;
public class actor {
    public actor(String name,int age,String gender){
        this.name = name;
        this.age=age;
        this.gender=gender;
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
    private String name;
    private String gender;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}