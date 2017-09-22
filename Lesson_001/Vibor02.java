/*
Даны два произвольных ненулевых числа. Арифметические операции над числами пронумерованы
(1-сложение, 2-вычитание, 3-умножение, 4-деление). Выполнить над числами операцию, соответствующую
введенному номеру.
*/
import java.util.Scanner;
class Vibor02 {
    public static void main(String[] args) {
        double firstNumber, secondNumber;
        int znak;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введи первое число: ");
        firstNumber = scn.nextDouble();
        System.out.print("Введи второе число: ");
        secondNumber = scn.nextDouble();
        System.out.print("Введи число соответствующее знаку: ");
        znak = scn.nextInt();

        switch (znak) {
            case 1 :
                double summa = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " + secondNumber + " = " + summa);
                break;
            case 2 :
                double raznost = firstNumber - secondNumber;
                System.out.println(firstNumber + " - " + secondNumber + " = " + raznost);
                break;
            case 3 :
                double proizvedenie = firstNumber * secondNumber;
                System.out.println(firstNumber + " * " + secondNumber + " = " + proizvedenie);
                break;
            case 4 :
                double chastnoe = firstNumber / secondNumber;
                System.out.println(firstNumber + " / " + secondNumber + " = " + chastnoe);
                break;
        }
    }
}