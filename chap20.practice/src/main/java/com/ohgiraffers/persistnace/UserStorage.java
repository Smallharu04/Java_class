package com.ohgiraffers.persistnace;

import com.ohgiraffers.domain.User;
import java.util.List;

public interface UserStorage {
    void saveUsers(List<User> users);
        List<User> loadUsers();
    }

