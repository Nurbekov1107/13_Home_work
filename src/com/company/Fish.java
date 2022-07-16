package com.company;

public class Fish {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("Fish's name is " + name);
    }

    public void getAge() {
        System.out.println(name + " is " + age + " years old");
    }

    public void setAge(int age) {
        this.age = age;
    }
}
