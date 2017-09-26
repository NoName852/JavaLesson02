/*
С клавиатуры вводятся числа до тех пор,
пока не введено четное число. Найти сумму чисел.
*/
import java.util.Scanner;
class ZiklWhile02 {
    public static void main(String[] args) {
        double chislo;
        double sum = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введи число: ");
        chislo = scn.nextDouble();        
        while (chislo % 2 != 0) {
            sum += chislo;
            System.out.print("Введи число: ");
            chislo = scn.nextDouble();
        }
        System.out.println("Введено четное число.");
        System.out.println("Сумма нечетных = " + sum);

    }
}