package org.example.lessons.les2;

public class Box {
    private final Long id;
    public String name;
    int size;

    public Box(Long id, String name, int size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public Box(Long id, String name) {
        this.id = id;
        this.name = name;
        this.size = 100;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @MyCustomAnnotation
    public void setName(String name) {
        this.name = name;
    }

    @MyCustomAnnotation(value = 8, message = "Text_Mess_Size")
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @MyCustomAnnotation(value = 5, message = "TextMessage")
    private void examplePrivateMethod(String value) {
        System.out.println("PrivateMethod VALUE = " + value);
    }
}
