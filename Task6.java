import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            convertMass();
        } else if (choice == 2) {
            convertDistance();
        } else {
            System.out.println("Некорректный выбор");
        }

        scanner.close();
    }

    public static void convertMass() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция ");
        int unit = scanner.nextInt();

        System.out.print("Введите количество выбранных единиц: ");
        double amount = scanner.nextDouble();

        System.out.println("Результат:");
        if (unit == 1) {
            System.out.println("Килограммы: " + amount);
            System.out.println("Фунты: " + amount * 2.20462);
            System.out.println("Унции: " + amount * 35.27396);
        } else if (unit == 2) {
            System.out.println("Килограммы: " + amount * 0.453592);
            System.out.println("Фунты: " + amount);
            System.out.println("Унции: " + amount * 16);
        } else if (unit == 3) {
            System.out.println("Килограммы: " + amount * 0.0283495);
            System.out.println("Фунты: " + amount * 0.0625);
            System.out.println("Унции: " + amount);
        } else {
            System.out.println("Некорректный выбор единицы измерения");
        }

        scanner.close();
    }

    public static void convertDistance() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут ");
        int unit = scanner.nextInt();

        System.out.print("Введите количество выбранных единиц: ");
        double amount = scanner.nextDouble();

        if (unit == 1) {
            System.out.println("Метры: " + amount);
            System.out.println("Мили: " + amount * 0.000621371);
            System.out.println("Ярды: " + amount * 1.09361);
            System.out.println("Футы: " + amount * 3.28084);
        } else if (unit == 2) {
            System.out.println("Метры: " + amount * 1609.34);
            System.out.println("Мили: " + amount);
            System.out.println("Ярды: " + amount * 1760);
            System.out.println("Футы: " + amount * 5280);
        } else if (unit == 3) {
            System.out.println("Метры: " + amount * 0.9144);
            System.out.println("Мили: " + amount * 0.000568182);
            System.out.println("Ярды: " + amount);
            System.out.println("Футы: " + amount * 3);
        } else if (unit == 4) {
            System.out.println("Метры: " + amount * 0.3048);
            System.out.println("Мили: " + amount * 0.000189394);
            System.out.println("Ярды: " + amount * 0.333333);
            System.out.println("Футы: " + amount);
        } else {
            System.out.println("Некорректный выбор единицы измерения");
        }

        scanner.close();
    }
}
