/*
Вычислить средний рост мальчиков и девочек в одном классе.
В классе учится N человек
*/
import java.util.Scanner;
class Slogn01 {
    public static void main(String[] args) {
        int n, nBoy, nGirl;
        double avgBoy = 0;
        double avgGirl = 0;
        double sumRostBoy = 0;
        double sumRostGirl = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Количество человек в классе = ");
        n = scn.nextInt();
        System.out.print("Количество мальчиков = ");
        nBoy = scn.nextInt();
        nGirl = n - nBoy;
        System.out.println("Количество девочек = " + nGirl);
        for (int i = 0; i < n; i++) {
            if (i < nBoy) {
                System.out.print("Введи рост " + (i + 1) + "-го ученика(мальчика): ");
                sumRostBoy += scn.nextDouble();
            } else {
                System.out.print("Введи рост " + (i + 1) + "-го ученика(девочки): ");
                sumRostGirl += scn.nextDouble();
            }
        }
        avgBoy = sumRostBoy / nBoy;
        avgGirl = sumRostGirl / nGirl;
        System.out.printf("Мальчиков в группе - %d. Средний рост = %.2f \n", nBoy, avgBoy);
        System.out.printf("Девочек в группе - %d. Средний рост = %.2f", nGirl, avgGirl);
    }
}