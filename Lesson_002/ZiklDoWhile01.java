/*
Запрашивая у пользователя произвольные символы, 
пока не будет введена точка, 
составить из них слово и подсчитать количество символов в слове.
*/
import java.util.Scanner;
class ZiklDoWhile01 {
    public static void main(String[] args) {
        String simvol;
        String slovo = "";
        int k = 0;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Введи символ: ");
            simvol = scn.nextLine().trim();
            slovo += simvol;
            k++;
        } while (!simvol.equals("."));
        System.out.println("Получившееся слово - " + slovo);
        System.out.println("Количество символов в слове = " + k);
    }
}