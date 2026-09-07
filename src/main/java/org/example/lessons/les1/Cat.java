package org.example.lessons.les1;

public class Cat extends Animal{

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void sayGreetings() {
        System.out.println("Hello! I'm cat!");
    }

    @Override
    public void eat() {
        System.out.println("Я ем рыбу!");
    }
}
