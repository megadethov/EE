package com.company.fig03_jdbc;

import java.sql.*;

/**
 * Created by mega on 28.09.2016.
 */
public class Main2 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("org.postgresql.Driver");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JavaCourse", "postgres", "postgres");

            System.out.println(connection.getClass().getCanonicalName());

            preparedStatement = connection.prepareStatement("SELECT region_id, region_name FROM region.jc_region WHERE region_id = ?");

            preparedStatement.setInt(1, 5);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("region_id: " + resultSet.getInt("region_id") + " region_name: " + resultSet.getString("region_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }

    }
}
