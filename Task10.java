 /*
 Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
 а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
 Размерность матрицы задается пользователем.
 */
 import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Первая строка матрицы, умноженная на 3: ");
        for (int j = 0; j < columns; j++) {
            System.out.print(matrix[0][j] * 3 + " ");
        }
    }
}
