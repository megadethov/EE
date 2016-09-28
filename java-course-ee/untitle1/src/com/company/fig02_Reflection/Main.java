package com.company.fig02_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by mega on 28.09.2016.
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        // переменная типа Class = классу Student
        Class<Student> studentClass = Student.class;

        // создание инстанса через Class
        Object student = studentClass.newInstance(); // доступны только методы Object

        // получение известного метода, параметры тоже передаются ч/з Class
        Method method = studentClass.getMethod("setName", String.class); // вызов метода setName(String name)

        // вызов метода у инстанса Object student
        // invoke (инстанс у к-го вызывается метод, параметры метода) - возвращает Object (для данного метода - null)
        Object ret = method.invoke(student, "Vasiliy");
        System.out.println(ret); // null

        Student st = (Student) student;
        System.out.println(st.getName()); // Vasiliy
    }
}
