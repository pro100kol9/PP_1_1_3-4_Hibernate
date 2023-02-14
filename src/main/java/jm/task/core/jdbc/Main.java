package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService usi = new UserServiceImpl();

        usi.createUsersTable();
        usi.saveUser("Ivan", "Ivanov", (byte) 18);
        usi.saveUser("Petr", "Petrov", (byte) 21);
        usi.saveUser("Sveta", "Svetikova", (byte) 45);
        usi.saveUser("Rodion", "Rodionov", (byte) 60);
        usi.getAllUsers();
        usi.cleanUsersTable();
        usi.dropUsersTable();

    }
}
