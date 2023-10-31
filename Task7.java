import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int x = 1;
        int y = 2;
        int z = 3;

        boolean containsConstant = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == x || array[i] == y || array[i] == z) {
                containsConstant = true;
                break;
            }
        }

        if (containsConstant) {
            System.out.println("Данное значение имеется в константах");
        }
    }
}