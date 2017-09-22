/*
Рассчитать значение по формуле
*/
import java.util.Scanner;

class Line02 {
    public static void main(String[] args) {
        int a, b, c;
        double x;
        Scanner in = new Scanner(System.in); //Создание объекта для чтения с клавиатуры
        System.out.print("Введи a = ");
        a = in.nextInt();
        System.out.print("Введи b = ");
        b = in.nextInt();
        System.out.print("Введи c = ");
        c = in.nextInt();
        
        x = a * ((Math.sin(b))/(20)) + Math.sqrt(c); //Расчет значения по формуле
        System.out.print("Значение x = ");
        System.out.println(x);
        System.out.printf("Отформатированное значение x = %.4f", x);
    }
}