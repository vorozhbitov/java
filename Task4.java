import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {

        // 1. Ввести три числа с клавиатуры x, y, z
        // Создаем объект Scanner для ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (x): ");
        double x = scanner.nextDouble();
        System.out.print("Введите второе число (y): ");
        double y = scanner.nextDouble();
        System.out.print("Введите третье число (z): ");
        double z = scanner.nextDouble();

        // 2. Найти и вывести в консоль среднее арифметическое этих чисел
        double average = (x + y + z) / 3;
        System.out.println(average);

        // 3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        int roundedAverage = (int) Math.floor(average / 2);

        // 4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (roundedAverage > 3) {
            System.out.println("Программа выполнена корректно");
        }

        scanner.close();
    }
}

