/*
Считать с клавиатуры число и строку и вывести их на экран
*/
import java.util.Scanner;

class Line01 {
    public static void main(String[] args) {
        int a;
        String stroka;
        Scanner in = new Scanner(System.in); //Создание объекта для чтения с клавиатуры

        System.out.print("Введи число: ");
        a = in.nextInt();
        in.nextLine();
        System.out.print("Введи строку: ");
        stroka = in.nextLine();

        System.out.printf("Число = %d \n", a);
        System.out.println("Строка = " + stroka);
    }
}