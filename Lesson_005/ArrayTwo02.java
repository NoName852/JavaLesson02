/*
Создать двумерный массив из 5 строк по 8 столбцов 
в каждой из случайных целых чисел из отрезка [-99;99]. 
Вывести массив на экран. 
Найти максимальный и минимальный элемент и их индекс
*/
import java.util.Random;
class ArrayTwo02 {
    public static void main(String[] args) {
        Random rnd = new Random();
        final int N = 8;
        final int M = 5;
        int[][] array = new int[M][N];
        int min, max;
        int minI, minJ, maxI, maxJ;
        //Заполнение массива случайными числами
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = rnd.nextInt(199) - 99;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        //Поиск минимального и масимального
        min = array[0][0]; 
        max = array[0][0];
        minI = 0; minJ = 0; 
        maxI = 0; maxJ = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j ++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    minI = i; minJ = j;
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxI = i; maxJ = j;
                }
            }
        }
        System.out.println("Максимальный элемент = " + max + ". Его интекс = [" + maxI + "," + maxJ + "].");
        System.out.println("Минимальный элемент = " + min + ". Его индекс = [" + minI + "," + minJ + "].");
    }
}