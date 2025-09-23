package com.ohgiraffers.persistnace;

import com.ohgiraffers.domain.User;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

    public class FileUserStorage implements UserStorage {

        private static final String FILE_PATH = "userDB.dat"; // 프로젝트 루트에 저장

        @Override
        public void saveUsers(List<User> users) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
                oos.writeObject(users);
            } catch (IOException e) {
                throw new RuntimeException("파일 저장 오류", e);
            }
        }

        @Override
        public List<User> loadUsers() {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                return new ArrayList<>();
            }
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                return (List<User>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException("파일 불러오기 오류", e);
            }
        }
    }

