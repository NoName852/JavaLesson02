/*
�������� ���������, ������� ���������� �� N-��� ����������� ���, 
� �������� ������ ��� ���� ����� ������. 
���� ����������� ����� ������ ������������� ����� �� ��� �� ����!�. 
����������� ������ �������� ��������������.
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
            System.out.print("����� " + (i + 1) + "-� ����������� ���: ");
            shortName = scn.nextLine();
            switch (shortName) {
                case "����" :
                    System.out.println("��� ����� \"" + shortName + "\". ������ ��� - \"�������\"");
                    break;
                case "����" :
                    System.out.println("��� ����� \"" + shortName + "\". ������ ��� - \"����������\"");
                    break;
                case "���" :
                    System.out.println("��� ����� \"" + shortName + "\". ������ ��� - \"�����\"");
                    break;
                case "�����" :
                    System.out.println("��� ����� \"" + shortName + "\". ������ ��� - \"���������\"");
                    break;
                case "������" :
                    System.out.println("��� ����� \"" + shortName + "\". ������ ��� - \"�������\"");
                    break;
                default :
                    System.out.println("� �� ���� ������� ����� ��� �������� \"" + shortName);
                    break;
            }
        }
    }
}