/*
Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20.
Далее:
1. Выведите максимальный и минимальный элемент массива.
2. Из максимального и минимального значения выведите наибольшее по модулю.
 */
import java.util.Random;
public class Task14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            array[i] = rand.nextInt(41) - 20;
        }

        int max = array[0];
        int min = array[0];
        for (int i = 1; i < 15; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        int maxAbs = Math.max(Math.abs(max), Math.abs(min));
        System.out.println("Наибольшее по модулю: " + maxAbs);
    }
}
