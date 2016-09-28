package com.company.fig01_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created by mega on 28.09.2016.
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException {

        // переменная типа Class = классу Student
        Class<Student> studentClass = Student.class;

        System.out.println("// полное имя препарируемого класса");
        System.out.println(studentClass.getCanonicalName());
        System.out.println("---------------------");

        System.out.println("// конструктор по умолчанию, если есть, иначе java.lang.NoSuchMethodException: com.company.fig01_Reflection.Student.<init>()");
        System.out.println(studentClass.getConstructor());
        System.out.println("---------------------");

        System.out.println("// массив всех конструкторов");
        Constructor[] constructors = studentClass.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }
        System.out.println("---------------------");

        System.out.println("// тип аргументов всех конструкторов");
        Constructor[] constructors2 = studentClass.getDeclaredConstructors();

        for (Constructor c : constructors2) {
            System.out.println(Arrays.toString(c.getParameters()));
        }
        System.out.println("---------------------");

        System.out.println("// массив всех только public полей");
        Field[] fields = studentClass.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println("---------------------");

        System.out.println("// массив всех задекларированных полей");
        Field[] fields2 = studentClass.getDeclaredFields();
        for (Field f : fields2) {
            System.out.println(f);
        }
        System.out.println("---------------------");


    }
}
