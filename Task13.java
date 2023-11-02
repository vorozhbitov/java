/*
Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
Например: “I love java 8 Я люблю java 14 core1”.
Выполните следующие действия:
1. Выведите слова, состоящие только из латиницы.
2. Выведите количество этих слов.

 */
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку из слов, разделенных пробелами:");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        int latinWordsCount = 0;

        System.out.println("Слова, состоящие только из латиницы:");

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                System.out.println(word);
                latinWordsCount++;
            }
        }

        System.out.println("Количество слов из латиницы: " + latinWordsCount);
    }
}
