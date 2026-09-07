package org.example.lessons.les2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Box sportBox = new Box(1L, "Sport Box", 20);
        Class<?> boxClass = Class.forName("org.example.lessons.les2.Box");
        //Fields
        /*
        System.out.println(boxClass.getName());
        System.out.println(boxClass.getSimpleName());

        Field[] fields = boxClass.getDeclaredFields();
        for (Field currentField : fields) {
            System.out.println("--------");
            System.out.println(currentField.getName());
            System.out.println(currentField.getType());
            System.out.println(currentField.getModifiers());
            System.out.println("Поле приватное? : "
                    + Modifier.isPrivate(currentField.getModifiers()));
        }
        System.out.println("---------------------");
        System.out.println(sportBox);
        Field someFieldName = boxClass.getField("name");
        someFieldName.set(sportBox, "reflection api box");
        System.out.println(sportBox);
        System.out.println("---------------------");
        System.out.println(sportBox);
        Field someFieldNameID = boxClass.getDeclaredField("id");
        someFieldNameID.setAccessible(true);
        someFieldNameID.set(sportBox, 99L);
        System.out.println(sportBox);
        */

        // Methods
        /*
        Method[] methods = boxClass.getMethods();
        for (Method currentMethod : methods) {
            System.out.println("-------------------------");
            System.out.println(currentMethod.getName());
            System.out.println(currentMethod.getReturnType());
            System.out.println(currentMethod.getModifiers());
            System.out.println("Метод приватный? :  "
                    + Modifier.isPrivate(currentMethod.getModifiers()) );
        }
        */

        //Parameters
        /*
        Method examplePrivateMethod =
                boxClass.getDeclaredMethod("examplePrivateMethod", String.class);
        System.out.println(examplePrivateMethod.getParameters());

        examplePrivateMethod.setAccessible(true);
        examplePrivateMethod.invoke(sportBox, "Example Value");
        */

        //Constructors
        /*
        Constructor<?>[] constructors = boxClass.getConstructors();
        for (Constructor<?> currentConstructor: constructors) {
            System.out.println("-----------------------");
            System.out.println(currentConstructor.getName());
            System.out.println(Arrays.toString(currentConstructor.getParameterTypes()));
        }

        Constructor<Box> constructor =
                (Constructor<Box>) boxClass.getConstructor(Long.class, String.class, int.class);

        Box createdManually = constructor.newInstance(5L, "Created manually", 100);
        System.out.println(createdManually);
        */

        // Methods

        Method[] declaredMethods = boxClass.getDeclaredMethods();
        for (Method currentMethod : declaredMethods) {
            System.out.println("--------------------");
            System.out.println(currentMethod.getName());
            if (currentMethod.isAnnotationPresent(MyCustomAnnotation.class)) {
                MyCustomAnnotation myCustomAnnotation =
                        currentMethod.getAnnotation(MyCustomAnnotation.class);
                if (myCustomAnnotation.value() >= 5) {
                    System.out.println("О, поймал свою же аннотацию над методом!"
                            + myCustomAnnotation.message());
                }

                Annotation[] annotations = myCustomAnnotation.annotationType().getAnnotations();

                for (Annotation currentAnnotation : annotations) {
                    System.out.println(currentAnnotation.annotationType().getName());
                }
            }

        }






    }
}