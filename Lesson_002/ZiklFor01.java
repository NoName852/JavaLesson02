/*
��������� ��������� ������ ������ ����� �������� ���������� ���
*/
import java.util.Scanner;
class ZiklFor01 {
    public static void main(String[] args) {
        int a, povtor;
        Scanner scn = new Scanner(System.in);
        System.out.print("������������� �����: ");
        a = scn.nextInt();
        System.out.print("���������� ����������: ");
        povtor = scn.nextInt();
        for (int i = 0; i < povtor; i++) {
            System.out.print(a + ", ");
        }
    }
}