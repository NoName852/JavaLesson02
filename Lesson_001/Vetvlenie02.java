/*
Вычислить значение выражения
y = sin(x) + cos(x), при -1 < x < 1
y = |x - 5|, при x <= -10
y = 10^1/x, при x > 5
y = 1 - x - x^2, в остальных случаях
*/
import java.util.Scanner;
class Vetvlenie02 {
    public static void main(String[] args) {
        double x;
        double y;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введи х: ");
        x = scn.nextDouble();

        if (x > -1 && x < 1) {
            y = Math.sin(x) + Math.cos(x);
            System.out.println("x принадлежит интервалу от -1 до 1. Y = " + y);
        } else if (x <= -10) {
            y = Math.abs(x - 5);
            System.out.println("x <= -10. Y = " + y);
        } else if (x > 5) {
            y = Math.pow(10, 1 / x);
            System.out.println("x > 5. Y = " + y);
        } else {
            y = 1 - x - Math.pow(x, 2);
            System.out.println("Y = " + y);
        }
    }
}