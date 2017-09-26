/*
Рассчитать значение функции y = sqrt(|sin(x) + cos(x)|) 
в интервале х от a до b с заданным шагом
*/
import java.util.Scanner;
class ZiklFor02 {
    public static void main(String[] args) {
        double x, y, a, b, step;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введи начало интервала: а = ");
        a = scn.nextDouble();
        System.out.print("Введи конец интервала: b = ");
        b = scn.nextDouble();
        System.out.print("Шаг = ");
        step = scn.nextDouble();
        for (x = a; x < b; x += step) {
            y = Math.sqrt(Math.abs(Math.sin(x) + Math.cos(x)));
            System.out.printf("При Х = %.2f значение Y = %.4f \n", x, y);
        }
    }
}