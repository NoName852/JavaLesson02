/*
Создать двумерный массив из 6 строк по 7 столбцов в каждой 
из случайных целых чисел из отрезка [0;9]. 
Вывести массив на экран.
Отсортировать элементы строк массива по убыванию.
*/
import java.util.Random;
class ArrayTwo04 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] array = new int[6][7];
        //Заполнение и вывод массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //Сортировка
        int max;
        int maxJ;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                max = array[i][j];
                maxJ = j;
                for (int jj = j + 1; jj < array[i].length; jj++) {
                    if (array[i][jj] > max) {
                        max = array[i][jj];
                        maxJ = jj; 
                    }
                }
                if (j != maxJ) {
                    int temp = array[i][j];
                    array[i][j] = array[i][maxJ];
                    array[i][maxJ] = temp;
                }
            }
        }
        //Вывод отсортированного массива
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}