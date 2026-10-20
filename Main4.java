package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(4, 2, 7, 2, 9, 4, 1, 7, 3, 9));

        System.out.print("исходный спск: ");
        System.out.println(numbers);

        List<Integer> uniqueNums = new ArrayList<>();
        for (int num : numbers) {
            if (!uniqueNums.contains(num)) {
                uniqueNums.add(num);
            }
        }

        System.out.print("сртрвнн спск: ");
        System.out.println(uniqueNums);

        for (int num : uniqueNums) {
            int count = 0;
            for (int current : numbers) {
                if (current == num) {
                    count++;
                }
            }
            System.out.println(num + " - " + count + " раза");
        }

        int max = numbers.get(0);
        int min = numbers.get(0);

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        
        }
        System.out.print("максимальное: ");
        System.out.println(max);
        System.out.print("минимальное: ");
        System.out.println(min);

        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / numbers.size();

        System.out.print("смм: ");
        System.out.println(sum);
        System.out.print("авараге: ");
        System.out.println(average);
    }
}