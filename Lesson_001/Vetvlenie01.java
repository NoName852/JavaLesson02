/*
Дано  двузначное число. Найти сумму составляющих его чисел, если эти числа четные, произведение если нечетные и разность в остальных случаях.
*/
import java.util.Scanner;
class Vetvlenie01 {
    public static void main(String[] args) {
        int a, rez;
        String message;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введи двузначное число: ");
        a = scn.nextInt();
        int first = a / 10;
        System.out.println("Первое составляющее число = " + first);
        int second = a % 10;
        System.out.println("Второе составляющее число = " + second);

        if (first % 2 == 0 && second % 2 == 0) {
            rez = first + second;
            message = "Числа четные. Их сумма = ";
        } else if (first % 2 != 0 && second % 2 != 0) {
            rez = first * second;
            message = "Числа нечетные. Их произведение = ";
        } else {
            rez = first - second;
            message = "Разность чисел = ";
        }

        System.out.println(message + rez);
    }
}