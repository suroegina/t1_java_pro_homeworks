package org.example.lessons.les1;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }
    @Override
    public void sayGreetings() {
        //System.out.println("Hello! I'm dog!");
        super.sayGreetings();
    }

    @Override
    public void eat() {
        System.out.println("Я ем косточку!");
    }

}

