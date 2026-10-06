package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
    static void printEmptyLines() {
        System.out.println();
        System.out.println();
    }

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();

        while (true) {
            printEmptyLines();

            System.out.println("1. добавить задачу");
            System.out.println("2. удалить первую задачу");
            System.out.println("3. удалить задачу по номеру");
            System.out.println("4. показать все задачи");
            System.out.println("5. выход");
            System.out.print("выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("введите текст задачи: ");
                String task = scanner.nextLine();
                tasks.add(task);
            } else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("список пуст");
                } else {
                    tasks.remove(0);
                    System.out.println("первая задача удалена");
                }
            } else if (choice == 3) {
                System.out.print("введи номер задачи: ");
                int index = scanner.nextInt();

                if ((index-1) >= 0 && (index-1) < tasks.size()) {
                    tasks.remove(index-1);
                } else {
                    System.out.println("неверный номер");
                }
            } else if (choice == 4) {
                int i = 1;
                for (String task : tasks) {
                    System.out.println(i + ". " + task);
                    i++;
                }
            } else if (choice == 5) {
                break;
            } else if (choice <= 0 || choice >5) {
                System.out.println("неверная команда");
            }            
        }

        scanner.close();
    }
}
