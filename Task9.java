/*
1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
2. Посчитайте среднее арифметическое элементов массива.
3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
 */

import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        double[] arrayDouble = new double[size];
        System.out.println("Введите элементы массива:");
        double sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arrayDouble[i] = scanner.nextDouble();
            sum += arrayDouble[i];
        }
        double average = sum / size;

        System.out.println("Массив, умноженный на среднее арифметическое: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Элемент " + (i + 1) + ": " + (arrayDouble[i] * average));
        }
    }
}
