/*
Создайте массив из 8 случайных целых чисел из отрезка [1;10]. 
Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль. 
Снова выведете массив на экран на отдельной строке.
*/
import java.util.Random;
class Array03 {
    public static void main(String[] args) {
        Random rnd = new Random();
        final int N = 8;
        int[] array = new int[N];
        //Заполняем массив случайными числами
        for (int i = 0; i < N; i++) {
            array[i] = rnd.nextInt(10) + 1;
        }
        //Вывод исходного массива
        System.out.println("Исходный массив:");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        //Замена элементов с нечетными индексами на 0
        for (int i = 0; i < N; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        //вывод нового массива
        System.out.println("\nМассив после изменений:");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}