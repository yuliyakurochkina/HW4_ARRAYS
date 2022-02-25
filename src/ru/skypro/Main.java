package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Задание 1,2,3
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int sum = 0;
        int min = 200000;
        int max = -1;
        double mid = 0;
        for (int elem : arr) {
            sum += elem;
            if (elem > max) {
                max = elem;
            }
            if (elem < min) {
                min = elem;
            }
            mid = sum / 30;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println("Максимальная сумма трат за день равна " + max + " руб.");
        System.out.println("Минимальная сумма трат за день равна " + min + " руб.");
        System.out.println("Средняя сумма трат за месяц составила " + mid + " рублей.");
        System.out.println();

        //Задание 4
        char[] reserveFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int j = reserveFullName.length - 1; j < reserveFullName.length; j--) {
            if (j >= 0) {
                System.out.print(reserveFullName[j]);
            }
        }
    }

    public static int[] generateRandomArray() {

        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int i = 0;

        for (; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        return arr;


    }

}
