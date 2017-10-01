/*
Создать двумерный массив из 8 строк по 5 столбцов. 
Заполнить его случайными целыми чисел из отрезка [10;99]. 
Вывести массив на экран.
*/
import java.util.Random;
class ArrayTwo01 {
    public static void main(String[] args) {
        Random rnd = new Random();
        final int N = 5;
        final int M = 8;
        int[][] array = new int[M][N];
        
        //Заполнение массива
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = rnd.nextInt(90) + 10;
            }
        }
        
        //Вывод массива
        System.out.println("Двумерный массив:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}