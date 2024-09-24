package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alexey", "Andreev", (byte) 20);
        userService.saveUser("Nikolay", "Chernykh", (byte) 35);
        userService.saveUser("Anna", "Egorova", (byte) 30);
        userService.saveUser("Elena", "Sidorova", (byte) 15);
        userService.getAllUsers();
        userService.removeUserById(2);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
