/*
Вводить с клавиатуры числа, пока сумма чисел не привысит 150. 
Вывести сумму и среднее арифметическое этих чисел
*/
import java.util.Scanner;
class ZiklWhile01 {
    public static void main(String[] args) {
        double chislo, sum, sr;
        int n = 0;
        Scanner scn = new Scanner(System.in);
        sum = 0;
        while (sum < 150) {
            System.out.print("Введи число: ");
            chislo = scn.nextDouble();
            sum += chislo;
            n++;
        }
        System.out.println("Сумма чисел превысила заданное значение");
        sr = sum / n;
        System.out.println("Количество чисел = " + n);
        System.out.printf("Сумма чисел = %.2f их среднее арифметическое = %.2f", sum, sr);
    }
}