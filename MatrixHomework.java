import java.util.Random;

public class MatrixHomework {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }

    static void task1() {
        System.out.println("\n1. Таблица умножения");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    static void task2() {
        System.out.println("\n2. Прямоугольник");

        int n = 4;
        int m = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void task3() {
        System.out.println("\n3. Треугольник");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void task4() {
        System.out.println("\n4. Количество четных чисел от 1 до 100");

        int count = 0;

        for (int tens = 0; tens < 10; tens++) {
            for (int num = tens * 10 + 1; num <= tens * 10 + 10; num++) {
                if (num % 2 == 0) {
                    count++;
                }
            }
        }

        System.out.println("Количество: " + count);
    }

    static void task5() {
        System.out.println("\n5. Сумма чисел от 1 до 100");

        int sum = 0;

        for (int tens = 0; tens < 10; tens++) {
            for (int num = tens * 10 + 1; num <= tens * 10 + 10; num++) {
                sum += num;
            }
        }

        System.out.println("Сумма: " + sum);
    }

    static int[][] getMatrix() {
        return new int[][]{
                {5, 8, 2},
                {7, 1, 9},
                {4, 6, 3}
        };
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void task6() {
        System.out.println("\n6. Массив 3x3");

        int[][] matrix = getMatrix();

        printMatrix(matrix);
    }

    static void task7() {
        System.out.println("\n7. Сумма всех элементов");

        int[][] matrix = getMatrix();
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Сумма: " + sum);
    }

    static void task8() {
        System.out.println("\n8. Максимальный элемент");

        int[][] matrix = getMatrix();
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Максимум: " + max);
    }

    static void task9() {
        System.out.println("\n9. Количество четных элементов");

        int[][] matrix = getMatrix();
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    count++;
                }
            }
        }

        System.out.println("Количество: " + count);
    }

    static void task10() {
        System.out.println("\n10. Сумма каждой строки");

        int[][] matrix = getMatrix();

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }

            System.out.println("Строка " + (i + 1) + ": " + sum);
        }
    }

    static void task11() {
        System.out.println("\n11. Сумма каждого столбца");

        int[][] matrix = getMatrix();

        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;

            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Столбец " + (j + 1) + ": " + sum);
        }
    }

    static void task12() {
        System.out.println("\n12. Главная диагональ");

        int[][] matrix = getMatrix();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();
    }

    static void task13() {
        System.out.println("\n13. Транспонирование матрицы");

        int[][] matrix = getMatrix();
        int[][] transposed = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        printMatrix(transposed);
    }

    static int[][] getRandomMatrix() {
        Random random = new Random();
        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50) + 1;
            }
        }

        return matrix;
    }

    static void task14() {
        System.out.println("\n14. Случайная матрица 5x5");

        int[][] matrix = getRandomMatrix();

        printMatrix(matrix);
    }

    static void task15() {
        System.out.println("\n15. Минимальный элемент и позиция");

        int[][] matrix = getRandomMatrix();

        printMatrix(matrix);

        int min = matrix[0][0];
        int row = 0;
        int col = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Минимум: " + min);
        System.out.println("Позиция: строка " + (row + 1) + ", столбец " + (col + 1));
    }

    static void task16() {
        System.out.println("\n16. Проверка симметричности");

        int[][] matrix = {
                {1, 2, 3},
                {2, 5, 6},
                {3, 6, 9}
        };

        printMatrix(matrix);

        boolean symmetric = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                }
            }
        }

        if (symmetric) {
            System.out.println("Матрица симметричная");
        } else {
            System.out.println("Матрица не симметричная");
        }
    }

    static void task17() {
        System.out.println("\n17. Поменять первую и последнюю строки");

        int[][] matrix = getMatrix();

        System.out.println("До:");
        printMatrix(matrix);

        for (int j = 0; j < matrix[0].length; j++) {
            int temp = matrix[0][j];
            matrix[0][j] = matrix[matrix.length - 1][j];
            matrix[matrix.length - 1][j] = temp;
        }

        System.out.println("После:");
        printMatrix(matrix);
    }

    static void task18() {
        System.out.println("\n18. Обнулить элементы меньше среднего");

        int[][] matrix = getRandomMatrix();

        System.out.println("До:");
        printMatrix(matrix);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }

        double average = (double) sum / count;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < average) {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("Среднее: " + average);
        System.out.println("После:");
        printMatrix(matrix);
    }
}