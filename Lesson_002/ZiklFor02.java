/*
���������� �������� ������� y = sqrt(|sin(x) + cos(x)|) 
� ��������� � �� a �� b � �������� �����
*/
import java.util.Scanner;
class ZiklFor02 {
    public static void main(String[] args) {
        double x, y, a, b, step;
        Scanner scn = new Scanner(System.in);
        System.out.print("����� ������ ���������: � = ");
        a = scn.nextDouble();
        System.out.print("����� ����� ���������: b = ");
        b = scn.nextDouble();
        System.out.print("��� = ");
        step = scn.nextDouble();
        for (x = a; x < b; x += step) {
            y = Math.sqrt(Math.abs(Math.sin(x) + Math.cos(x)));
            System.out.printf("��� � = %.2f �������� Y = %.4f \n", x, y);
        }
    }
}