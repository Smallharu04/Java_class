package com.ohgiraffers.ui;


import com.ohgiraffers.domain.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    // 사용자 저장할 리스트 (DB 대신 사용)
    private List<User> users = new ArrayList<>();

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 메뉴 ===");
            System.out.println("1. 사용자 등록");
            System.out.println("2. 사용자 조회");
            System.out.println("0. 종료");
            System.out.print("번호 선택: ");

            int menu = Integer.parseInt(sc.nextLine());

            if (menu == 1) {
                // 사용자 등록
                System.out.println("회원번호 : ");
                int id = sc.nextInt();
                System.out.print("이름: ");
                String name = sc.nextLine();
                System.out.print("나이: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.print("이메일: ");
                String email = sc.nextLine();
                System.out.print("비밀번호(숫자): ");
                int pw = Integer.parseInt(sc.nextLine());

                User user = new User(id, name, age, email, pw);
                users.add(user);

                System.out.println("등록 완료! → " + user.getName());

            } else if (menu == 2) {
                // 사용자 조회
                System.out.print("조회할 이름: ");
                String searchName = sc.nextLine();

                boolean found = false;
                for (User u : users) {
                    if (u.getName().equals(searchName)) {
                        System.out.println("조회 성공! 이름=" + u.getName() + ", 나이=" + u.getAge() + ", 이메일=" + u.getEmail());
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("해당 이름의 사용자가 없습니다.");
                }

            } else if (menu == 0) {
                System.out.println("프로그램 종료!");
                break;
            } else {
                System.out.println("잘못 입력했습니다.");
            }
        }

    }
    public static void main(String[] args) {
        new Application().run();
    }
}

