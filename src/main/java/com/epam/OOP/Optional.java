package com.epam.OOP;

public class Optional {
    public static void main(String[] args) {
        Dog dog = new Dog("black", 4, true);
        Bird bird = new Bird("white", 2, false);

        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());

    }

}
