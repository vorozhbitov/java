/*
Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
*/
public class Task12 {
    public static void main(String[] args) {
        String inputString = "I like Java!!!";

        if (inputString.contains("Java") && inputString.startsWith("I like") && inputString.endsWith("!!!")) {
            System.out.println(inputString.toUpperCase());
        }

        // 5
        String replacedString = inputString.replace('a', 'o');
        String subString = replacedString.substring(7, 11);
        System.out.println("Замененная строка: " + replacedString);
        System.out.println("Подстрока 'Jovo': " + subString);
    }
}
