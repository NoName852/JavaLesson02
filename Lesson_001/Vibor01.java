/*
В зависимости от введенного числа вывести соответствующий день недели
*/
import java.util.Scanner;
class Vibor01 {
    public static void main(String[] args) {
        int day;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введи день недели: ");
        day = scn.nextInt();
        switch (day) {
            case 1 : 
                System.out.println("Понедельник");
                break;
            case 2 :
                System.out.println("Вторник");
                break;
            case 3 :
                System.out.println("Среда");
                break;
            case 4 :
                System.out.println("Четверг");
                break;
            case 5 :
                System.out.println("Пятница");
                break;
            case 6 :
                System.out.println("Суббота");
                break;
            case 7 :
                System.out.println("Воскресенье");
                break;
            default :
                System.out.println("Такого дня не существует");
                break;
        }
    }
}