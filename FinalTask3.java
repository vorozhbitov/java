/*
Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
Среди данных строк найти строку с максимальным количеством различных символов.
Если таких строк будет много, то вывести первую.

Пример для теста работы программы:
Количество строк: 3
Строка 1: привет
Строка 2: анализ
Строка 3: 111111111111
Ответ: привет
 */
import java.util.Scanner;
public class FinalTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Чтобы считать символ новой строки после числа

        String maxDiffCharsString = "";
        int maxDiffCharsCount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Строка " + i + ": ");
            String inputString = scanner.nextLine();

            int diffCharsCount = countDifferentChars(inputString);

            if (diffCharsCount > maxDiffCharsCount) {
                maxDiffCharsCount = diffCharsCount;
                maxDiffCharsString = inputString;
            }
        }

        if (!maxDiffCharsString.isEmpty()) {
            System.out.println("Ответ: " + maxDiffCharsString);
        } else {
            System.out.println("Вы не ввели ни одной строки.");
        }

        scanner.close();
    }

    private static int countDifferentChars(String inputString) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (inputString.indexOf(currentChar) == i) {
                count++;
            }
        }
        return count;
    }
}
