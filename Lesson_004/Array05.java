/*
Дан произвольный массив целых двузначных чисел.
Отсортировать массив по возрастанию методом выбора
*/
import java.util.Random;
import java.util.Scanner;
class Array05 {
    public static void main(String[] args){
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        int n;
        int[] arrayA;
        System.out.print("Количество чисел в массиве = ");
        n = scn.nextInt();
        arrayA = new int[n];
        System.out.println("Исходный массив:");
        //Заполняем массив случайными числами и выводим его на экран
        for (int i = 0; i < n; i++) {
            arrayA[i] = rnd.nextInt(99) + 1;
            System.out.print(arrayA[i] + " ");
        }
        //Сортировка по возрастанию методом выбора
        for (int i = 0; i < n; i++) {
            int min = arrayA[i];
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arrayA[j] < min) {
                    min = arrayA[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arrayA[i];
                arrayA[i] = arrayA[minIndex];
                arrayA[minIndex] = temp;
            }
        }
        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(arrayA[i] + " ");
        }

    }
}