/*
���������� � ������������ ������������ �������, 
���� �� ����� ������� �����, 
��������� �� ��� ����� � ���������� ���������� �������� � �����.
*/
import java.util.Scanner;
class ZiklDoWhile01 {
    public static void main(String[] args) {
        String simvol;
        String slovo = "";
        int k = 0;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("����� ������: ");
            simvol = scn.nextLine().trim();
            slovo += simvol;
            k++;
        } while (!simvol.equals("."));
        System.out.println("������������ ����� - " + slovo);
        System.out.println("���������� �������� � ����� = " + k);
    }
}