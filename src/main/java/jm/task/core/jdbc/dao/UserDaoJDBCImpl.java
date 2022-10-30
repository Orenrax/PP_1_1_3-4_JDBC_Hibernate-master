package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
//        - создаём: String переменная = "команда на языке БД"
//        - создаём: Statement переменная = наш метод из класса Util
//        - используя нашу созданную переменную Statement, запихиваем туда нашу переменную String (та, что с командами БД)

        String cr = "insert into users (name, age, email) values ('Idea',22,'idea@mail.ru');";


        //Statement statement = Util.Main();
        //statement.execute(cr);

    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
