/*
Напишите программу, которая позволит решить простое уравнение относительно x.
Программа принимает на вход строку длиной 5 символов.
Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
Нужно найти неизвестное.

Пример для теста работы программы:
- Ввод: x+5=7
- Вывод: 2
- Ввод: 3-x=9
- Вывод: -6
- Ввод: 3-3=x
- Вывод: 0
 */
import java.util.Scanner;
public class FinalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите уравнение из 5 символов (например, x+5=7): ");
        String input = scanner.nextLine();

        char[] equation = input.toCharArray();
        char sign = equation[1];
        int num1 = Character.getNumericValue(equation[0]);
        int num2 = Character.getNumericValue(equation[2]);
        int num3 = Character.getNumericValue(equation[4]);

        int result;

        if (equation.length != 5) {
            System.out.println("Введенная строка должна быть в 5 символов");
        } else if (equation[3] != '=') {
            System.out.println("Знак равенства не на месте");
        } else {
            if (equation[0] == 'x') {
                if (sign == '+') {
                    result = num3 - num2;
                } else {
                    result = num3 + num2;
                }
            } else if (equation[2] == 'x') {
                if (sign == '+') {
                    result = num3 - num1;
                } else {
                    result = num1 - num3;
                }
            } else {
                if (sign == '+') {
                    result = num1 + num2;
                } else {
                    result = num1 - num2;
                }
            }

            System.out.println("Вывод: " + result);
        }

    }
}
