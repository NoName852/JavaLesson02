/*
������� � ���������� �����, ���� ����� ����� �� �������� 150. 
������� ����� � ������� �������������� ���� �����
*/
import java.util.Scanner;
class ZiklWhile01 {
    public static void main(String[] args) {
        double chislo, sum, sr;
        int n = 0;
        Scanner scn = new Scanner(System.in);
        sum = 0;
        while (sum < 150) {
            System.out.print("����� �����: ");
            chislo = scn.nextDouble();
            sum += chislo;
            n++;
        }
        System.out.println("����� ����� ��������� �������� ��������");
        sr = sum / n;
        System.out.println("���������� ����� = " + n);
        System.out.printf("����� ����� = %.2f �� ������� �������������� = %.2f", sum, sr);
    }
}