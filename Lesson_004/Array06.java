/*
Дан произвольный целочисленый двузначный одномерный массив.
Отсортировать значения массива по убыванию методом пузырька
*/
import java.util.Scanner;
import java.util.Random;
class Array06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int n;
        System.out.print("Количество чисел в массиве = ");
        n = scn.nextInt();
        int[] array = new int[n];
        //Заполнение массива и вывод на экран
        for (int i = 0; i < n; i++) {
            array[i] = rnd.nextInt(99) + 1;
            System.out.print(array[i] + " ");
        }
        //Сортировка массива методом пузырька
        for (int i = n - 1; i >= 2; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}