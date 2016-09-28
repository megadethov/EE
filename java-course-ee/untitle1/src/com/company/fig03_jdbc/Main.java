package com.company.fig03_jdbc;

/**
 * Created by mega on 28.09.2016.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        // регистрация JDBC driver
        Class.forName("org.postgresql.Driver");
    }
}
