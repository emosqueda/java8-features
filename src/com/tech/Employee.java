package com.tech;

public class Employee {
    private String name;
    private String address;
    private int age;
    private String position;
    private int experienceYears;

    public Employee(String name, String address, int age, String position, int experienceYears) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.position = position;
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }
}
