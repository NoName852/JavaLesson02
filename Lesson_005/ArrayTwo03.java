/*
Cоздать двумерный массив из 7 строк по 4 столбца в каждой 
из случайных целых чисел из отрезка [-5;5]. 
Вывести массив на экран. Определить и вывести на экран 
индекс строки с наибольшим по модулю произведением элементов.
Если таких строк несколько, то вывести индекс первой встретившейся из них.
*/
import java.util.Random;
class ArrayTwo03 {
    public static void main(String[] args) {
        Random rnd = new Random();
        final int M = 7; 
        final int N = 4;
        int[][] array = new int[M][N];
        int pr = 1;
        int maxPr = 0;
        int maxPrIndex = 0;
        //Заполнение и вывод массива
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = rnd.nextInt(11) - 5;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        //Поиск максимального произведения
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                pr *= array[i][j];
            }
            if (Math.abs(pr) > Math.abs(maxPr)) {
                maxPr = pr;
                maxPrIndex = i;
            }
            pr = 1;
        }
        System.out.println("Максимальное произведение элементов = " + Math.abs(maxPr));
        System.out.println("находится в строке - " + maxPrIndex);
    }
}