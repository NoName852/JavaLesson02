/*
Создайте массив из всех чётных чисел от 2 до 20 и 
выведите элементы массива на экран сначала в строку, 
отделяя один элемент от другого пробелом, 
а затем в столбик (отделяя один элемент от другого началом новой строки).
*/
class Array02 {
    public static void main(String[] args) {
        int n = 20;
        int m = n / 2;
        int j = 0;
        int[] array = new int[m];
        //Заполнение массива четными числами
        for (int i = 2; i <= n; i += 2) {
            array[j] = i;
            j++;
        }
        //Вывод массива
        System.out.println("Массив в строку");
        for (int i = 0; i < m; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\nМассив в столбец");
        for (int i = 0; i < m; i++) {
            System.out.println(array[i]);
        }
    }
}