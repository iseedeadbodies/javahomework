package javaarray;

import java.util.Scanner;

public class CountZeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент: ");
            arr[i] = scanner.nextInt();

            if (arr[i] == 0) {
                count++;
            }
        }

        System.out.println("Количество нулей: " + count);

        scanner.close();
    }
}
