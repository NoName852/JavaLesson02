/*
� ���������� �������� ����� �� ��� ���,
���� �� ������� ������ �����. ����� ����� �����.
*/
import java.util.Scanner;
class ZiklWhile02 {
    public static void main(String[] args) {
        double chislo;
        double sum = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("����� �����: ");
        chislo = scn.nextDouble();        
        while (chislo % 2 != 0) {
            sum += chislo;
            System.out.print("����� �����: ");
            chislo = scn.nextDouble();
        }
        System.out.println("������� ������ �����.");
        System.out.println("����� �������� = " + sum);

    }
}