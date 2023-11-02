/*
1. Ввести первое число с клавиатуры и записать его в строковую переменную.
2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
3. Сравнить 2 числа и вывести большее на экран
4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
*/
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String strNumber1 = scanner.nextLine();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        scanner.nextLine(); // Очистить буфер после ввода числа

        int number1 = Integer.parseInt(strNumber1);
        if (number1 > number2) {
            System.out.println("Большее число: " + number1);
        } else if (number2 > number1) {
            System.out.println("Большее число: " + number2);
        } else {
            System.out.println("Числа равны между собой.");
        }

        double smallerNumber = Math.min(number1, number2);
        System.out.println("Меньшее число в формате double: " + (double) smallerNumber);
    }

}
