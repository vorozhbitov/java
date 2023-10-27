public class Task3 {
    public static void main(String[] args) {
        //1. Задайте массив из 5 любых целых чисел
        int[] numbers = {1, 2, 3, 4, 5};

        //2. Поменяйте местами первый и последний элемент в массиве
        int temp = numbers[0];
        numbers[0] = numbers[numbers.length-1];
        numbers[numbers.length-1] = temp;

        //3. Вывести в консоль результат суммы первого и среднего элемента
        int summ = numbers[0] + numbers[numbers.length/2];

        System.out.println(summ);
    }
}
