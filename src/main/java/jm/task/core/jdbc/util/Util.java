package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД
    public static class Main {
        private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "root";

        public static void main(String[] args) {
            Connection connection;
            try {
                Driver driver = new com.mysql.cj.jdbc.Driver();
                DriverManager.registerDriver(driver);
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);


                Statement statement = connection.createStatement();
                statement.execute("insert into users (name, age, email) values ('Idea',22,'idea@mail.ru');");



                if (!connection.isClosed()) {
                    System.out.println("Соединение с БД установлено");
                }
                connection.close();
                if (connection.isClosed()) {
                    System.out.println("Соединение с БД закрыто");
                }

                } catch (SQLException e) {
                    System.out.println("Соединение с БД не установлено");
                }
            }
        }




}
