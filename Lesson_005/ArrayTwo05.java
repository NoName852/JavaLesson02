/*
Для проверки остаточных знаний учеников после летних каникул, 
учитель младших классов решил начинать каждый урок с того, 
чтобы задавать каждому ученику пример из таблицы умножения, 
но в классе 15 человек, а примеры среди них не должны повторяться. 
В помощь учителю напишите программу, которая будет выводить на экран 
15 случайных примеров из таблицы умножения 
(от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты). 
При этом среди 15 примеров не должно быть повторяющихся 
(примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).
*/
import java.util.Random;
class ArrayTwo05 {
    public static void main(String[] args) {
        Random rnd = new Random();
        final int N = 15;
        int[][] array = new int[2][N];
        boolean isPovtor = true;
        int one = 0;
        int two = 0;

        for (int i = 0; i < N; i++) {
            do{
                one = rnd.nextInt(8) + 2;
                two = rnd.nextInt(8) + 2;
                for (int j = 0; j < i + 1; j++) {
                    if ((one == array[0][j] && two == array[1][j]) || (one == array[1][j] && two == array[0][j])) {
                        j = 0;
                        isPovtor = true;
                        break;
                    } else {
                        isPovtor = false;
                        continue;
                    }
                }
            } while(isPovtor == true);
                array[0][i] = one;
                array[1][i] = two;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Примеры для проверки учеников:");
        for (int i = 0; i < N; i++) {
            System.out.println((i + 1) + ") " + array[0][i] + " * " + array[1][i] + " = " + array[0][i] * array[1][i]);
        }
    }
}