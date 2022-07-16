package com.company;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Parrot parrot = new Parrot();
        Cat cat = new Cat();
        Dog dog = new Dog();

        fish.setName("Altyn balyk");
        fish.setAge(3);
        fish.getName();
        fish.getAge();

        parrot.setName("Totukush");
        parrot.setAge(5);
        parrot.getName();
        parrot.getAge();

        cat.setName("Murka");
        cat.setAge(4);
        cat.getName();
        cat.getAge();

        dog.setName("Ak tosh");
        dog.setAge(10);
        dog.getName();
        dog.getAge();

    }
}