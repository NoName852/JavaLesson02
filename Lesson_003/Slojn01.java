/*
��������� ������� ���� ��������� � ������� � ����� ������.
� ������ ������ N �������
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
        System.out.print("���������� ������� � ������ = ");
        n = scn.nextInt();
        System.out.print("���������� ��������� = ");
        nBoy = scn.nextInt();
        nGirl = n - nBoy;
        System.out.println("���������� ������� = " + nGirl);
        for (int i = 0; i < n; i++) {
            if (i < nBoy) {
                System.out.print("����� ���� " + (i + 1) + "-�� �������(��������): ");
                sumRostBoy += scn.nextDouble();
            } else {
                System.out.print("����� ���� " + (i + 1) + "-�� �������(�������): ");
                sumRostGirl += scn.nextDouble();
            }
        }
        avgBoy = sumRostBoy / nBoy;
        avgGirl = sumRostGirl / nGirl;
        System.out.printf("��������� � ������ - %d. ������� ���� = %.2f \n", nBoy, avgBoy);
        System.out.printf("������� � ������ - %d. ������� ���� = %.2f", nGirl, avgGirl);
    }
}