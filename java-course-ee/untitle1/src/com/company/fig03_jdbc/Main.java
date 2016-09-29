package com.company.fig03_jdbc;

import java.sql.*;

/**
 * Created by mega on 28.09.2016.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // регистрация JDBC driver
        Class.forName("org.postgresql.Driver");

        // получить соединение с БД (интерфейс java.sql.Connection) ч/з java.sql.DriverManager
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JavaCourse", "postgres", "postgres");

        // узнать точное имя класса за интерфейсом Connection
        System.out.println(connection.getClass().getCanonicalName()); // org.postgresql.jdbc.PgConnection

        // SQL запрос к БД // ? - временна для прекомпиляции
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT region_id, region_name FROM region.jc_region WHERE region_id = ?");

        // насетили вместо 1 встреченного значения int ? = 5
        preparedStatement.setInt(1, 5);

        // записать результат выполнения SQL запроса в resultSet
        ResultSet resultSet = preparedStatement.executeQuery();

        // в цикле пройти по таблице в ResultSet
        while (resultSet.next()) {
            System.out.println("region_id: " + resultSet.getInt("region_id") + " region_name: " + resultSet.getString("region_name"));
        }

        // закрытие ресурсов
        resultSet.close(); // не забывать
        preparedStatement.close(); // не забывать
        connection.close(); // не забывать
    }
}
