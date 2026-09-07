package org.example.homeworks.task1;

import org.example.homeworks.task1.Annotations.*;
import org.example.homeworks.task1.Annotations.Test;

public class Tasks {
    @BeforeSuite
    public static void beforeAll(){
        System.out.println("Начинаем тесты.");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Начали тест:");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Закончили тест:");
    }
    @AfterSuite
    public static void afterAll(){
        System.out.println("Тесты завершены.");
    }

    @Order(6)
    @Test(methodName = "Тест на проверку сложения простых чисел")
    public void testAddition(){
        assert 5+3 == 8 : " 5 + 3 = 8!";
    }

    @Order(3)
    @Test(methodName = "Тест на проверку вычитания простых чисел")
    public void testSubtraction(){
        assert 7-5 == 2 : "7-5 = 2!";
    }

    @Order(9)
    @Test(methodName = "Тест на проверку умножения двух чисел")
    public void testMultiply(){
        assert 8*5 == 40 : "8*5 = 40!";
    }

    @Order
    @Test
    @Disabled
    public void testSkipped(){
        assert false: "Тест пропускаем!";
    }

    @Order(value = 7)
    @Test
    public void testError() {
        throw new RuntimeException("Пользовательская ошибка!");
    }
}
