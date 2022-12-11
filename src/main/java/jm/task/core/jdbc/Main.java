package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ilmir", "Khafizov", (byte) 27);
        userService.saveUser("Elza", "Khafizova", (byte) 28);
        userService.saveUser("Ilyas", "Yakupov", (byte) 27);
        userService.saveUser("Dasha", "Pavlova", (byte) 25);
        List<User> userList = userService.getAllUsers();
        System.out.println(userList);
        userService.removeUserById(2L);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
