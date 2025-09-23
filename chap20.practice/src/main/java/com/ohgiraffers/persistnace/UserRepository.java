package com.ohgiraffers.persistnace;


import com.ohgiraffers.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private final UserStorage userStorage;
    private final List<User> userList;


    public UserRepository(UserStorage userStorage) {
        this.userStorage = userStorage;
        this.userList = userStorage.loadUsers();
    }

    public List<User> selectAllUsers() {
        return new ArrayList<>(userList);
    }

    public User selectUserById(int id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                return userList.get(i);
            }
        }
        return null;
    }

    public void insertUser(User user) {
        userList.add(user);
        userStorage.saveUsers(userList);
    }
}


