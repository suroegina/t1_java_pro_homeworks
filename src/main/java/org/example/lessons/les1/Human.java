package org.example.lessons.les1;

public record Human(String name, int age) {
    public Human{
        validateStringaram(name);
    }

    private void validateStringaram(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is not correct!");
        }
    }
}
/*public class Human {
    private final String name;
    private int age;


    public Human(String name) {
        validateStringaram(name);
        this.name = name;
        this.age = 0;
    }

    public Human(String name, int age) {
        validateStringaram(name);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void validateStringaram(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is not correct!");
        }
    }

   @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}*/
