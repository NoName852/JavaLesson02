/*
Создайте массив из 15 случайных целых чисел из отрезка [0;9]. 
Выведите массив на экран. Подсчитайте сколько в массиве чётных 
элементов и выведете это количество на экран на отдельной строке.
*/
import java.util.Random;
class Array01 {
    public static void main(String[] args) {
        Random rnd = new Random();
        final int N = 15;
        int[] array = new int[N];
        int k = 0;
        //Заполнение массива случайными числами
        for (int i = 0; i < N; i++) {
            array[i] = rnd.nextInt(10);
        }
        //Вывод массива и подсчит количества четных элементов
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                k++;
            }
            System.out.print(array[i] + "  ");
        }
        System.out.println("\nКоличество четных элементов в массиве = " + k);

    }
}