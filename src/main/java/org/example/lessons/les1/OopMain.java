package org.example.lessons.les1;

public class OopMain {
    public static void main(String[] args) {
        Human human = new Human("Daria", 38);
        //System.out.println(human.toString());
        System.out.println(human);
        var hum = new Human("Gera", 9);
        //hum.setName("Daria");
        //hum.setAge(38);
        //System.out.println("Name: " + hum.getName()
          //      + " Age:" + hum.getAge());
        //hum.setName(null);
        Dog dog = new Dog("Rex", "black");
        dog.sayGreetings();
        dog.eat();
        Cat cat = new Cat("Basik", "White");
        cat.eat();
        Animal[] animals = new Animal[]{cat,dog};
        for (Animal currentAnimal : animals) {
            if (currentAnimal instanceof Cat) {
                System.out.println("Сейчас тут кошка!");
            } else if (currentAnimal instanceof Dog) {
                System.out.println("Сейчас тут собака!");
            }
            currentAnimal.eat();
        }

    }
}
