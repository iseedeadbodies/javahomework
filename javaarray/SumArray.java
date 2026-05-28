package javaarray;

import java.util.Scanner;

public class SumArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент: ");
            arr[i] = scanner.nextInt();

            sum += arr[i];
        }

        System.out.println("Сумма элементов: " + sum);

        scanner.close();
    }
}