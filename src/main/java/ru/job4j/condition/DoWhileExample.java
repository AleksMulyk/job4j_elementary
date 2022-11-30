package ru.job4j.condition;

import java.util.Scanner;
// цикл do-while - выполняется код потом происходит проверка
//ввод пароля
public class DoWhileExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int password;
        do {
            System.out.println("Введите пароль: ");
            password = scanner.nextInt();
        } while (password != 555);
        System.out.println("Пароль введён успешно");
    }
}
