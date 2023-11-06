/*
Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
Итоговое значение должно быть округлено до двух знаков после запятой.

Пример для теста работы программы:
- Курс доллара: 67,55
- Количество рублей: 1000
- Итого: 14,80 долларов
 */
import java.util.Scanner;
public class FinalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Курс доллара: ");
        double exchangeRate = scanner.nextDouble();

        System.out.print("Количество рублей: ");
        double rubles = scanner.nextDouble();

        double dollars = rubles / exchangeRate;
        dollars = Math.round(dollars * 100.0) / 100.0;

        System.out.println("Итого: " + dollars + " долларов");

        scanner.close();
    }
}
