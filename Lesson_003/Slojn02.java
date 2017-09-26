/*
Написать программу, которая спрашивала бы N-раз сокращенное имя, 
а печатала полное для пяти ваших друзей. 
Ввод незнакомого имени должен провоцировать ответ «Я вас не знаю!». 
Необходимые данные задавать самостоятельно.
*/
import java.util.Scanner;
class Slojn02 {
    public static void main(String[] args) {
        int n;
        String shortName;
        Scanner scn = new Scanner(System.in);
        System.out.print("N = ");
        n = scn.nextInt();
        scn.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Введи " + (i + 1) + "-е сокращенное имя: ");
            shortName = scn.nextLine();
            switch (shortName) {
                case "Вася" :
                    System.out.println("Для имени \"" + shortName + "\". Полное имя - \"Василий\"");
                    break;
                case "Кеша" :
                    System.out.println("Для имени \"" + shortName + "\". Полное имя - \"Иннокентий\"");
                    break;
                case "Оля" :
                    System.out.println("Для имени \"" + shortName + "\". Полное имя - \"Ольга\"");
                    break;
                case "Настя" :
                    System.out.println("Для имени \"" + shortName + "\". Полное имя - \"Анастасия\"");
                    break;
                case "Аркаша" :
                    System.out.println("Для имени \"" + shortName + "\". Полное имя - \"Аркадий\"");
                    break;
                default :
                    System.out.println("Я не знаю полного имени для краткого \"" + shortName);
                    break;
            }
        }
    }
}