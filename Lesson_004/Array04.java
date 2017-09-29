/*
Создайте массив из 10 целых чисел введенных с клавиатуры. 
Выведите массив на экран. 
Подсчитайте сколько в массиве чётных элементов и выведете 
это количество на экран на отдельной строке.
*/
import java.util.Scanner;
class Array04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        final int N = 10;
        int k = 0;
        int[] array = new int[N];
        //Заполнение массива числами
        for (int i = 0; i < N; i++) {
            System.out.print(i + "-й элемент = ");
            array[i] = scn.nextInt();
        }
        //Вывод исходного массива
        System.out.println("Исходный массив");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
            //Подсчет количества четных элементов
            if (array[i] % 2 == 0) {
                k++;
            }
        }
        System.out.println("\nКоличество четных элементов массива = " + k);
    }
}