import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    static int operationsCount = 0;
    static double lastResult = 0;
    static boolean hasLastResult = false;

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = readInt("Выберите пункт: ");

            switch (choice) {
                case 1:
                    calculate("+");
                    break;
                case 2:
                    calculate("-");
                    break;
                case 3:
                    calculate("*");
                    break;
                case 4:
                    calculate("/");
                    break;
                case 5:
                    calculate("%");
                    break;
                case 6:
                    calculate("^");
                    break;
                case 7:
                    average();
                    break;
                case 8:
                    showStats();
                    break;
                case 0:
                    System.out.println("Выход из программы...");
                    break;
                default:
                    System.out.println("Ошибка: неверный пункт меню!");
            }

        } while (choice != 0);
    }

    static void showMenu() {
        System.out.println("\n===== CALC MENU =====");
        System.out.println("1 - Сложение (+)");
        System.out.println("2 - Вычитание (-)");
        System.out.println("3 - Умножение (*)");
        System.out.println("4 - Деление (/)");
        System.out.println("5 - Остаток от деления (%)");
        System.out.println("6 - Степень (a^b)");
        System.out.println("7 - Среднее из N чисел");
        System.out.println("8 - Показать статистику");
        System.out.println("0 - Выход");
        System.out.println("=====================");
    }

    static void calculate(String operation) {
        double a;

        if (hasLastResult) {
            System.out.println("Использовать последний результат как первое число?");
            System.out.println("1 - Да");
            System.out.println("2 - Нет");
            int useLast = readInt("Ваш выбор: ");

            if (useLast == 1) {
                a = lastResult;
                System.out.println("Первое число: " + a);
            } else {
                a = readDouble("Введите a: ");
            }
        } else {
            a = readDouble("Введите a: ");
        }

        double b = readDouble("Введите b: ");
        double result;

        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Ошибка: деление на 0 запрещено!");
                    return;
                }
                result = a / b;
                break;
            case "%":
                if (b == 0) {
                    System.out.println("Ошибка: остаток от деления на 0 запрещен!");
                    return;
                }
                result = a % b;
                break;
            case "^":
                result = Math.pow(a, b);
                break;
            default:
                System.out.println("Ошибка операции!");
                return;
        }

        lastResult = result;
        hasLastResult = true;
        operationsCount++;

        System.out.println("Результат: " + result);
    }

    static void average() {
        int n = readInt("Введите количество чисел N: ");

        if (n <= 0) {
            System.out.println("Ошибка: N должно быть больше 0!");
            return;
        }

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            double number = readDouble("Введите число " + i + ": ");
            sum += number;
        }

        double result = sum / n;

        lastResult = result;
        hasLastResult = true;
        operationsCount++;

        System.out.println("Среднее значение: " + result);
    }

    static void showStats() {
        System.out.println("\n===== СТАТИСТИКА =====");
        System.out.println("Количество выполненных операций: " + operationsCount);

        if (hasLastResult) {
            System.out.println("Последний результат: " + lastResult);
        } else {
            System.out.println("Последнего результата пока нет.");
        }
    }

    static int readInt(String message) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Ошибка: введите целое число!");
                scanner.next();
            }
        }
    }

    static double readDouble(String message) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Ошибка: введите число!");
                scanner.next();
            }
        }
    }
}
```

