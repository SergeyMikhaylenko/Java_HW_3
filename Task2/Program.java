package Task2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Program
 */

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class Program {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int value = rnd.nextInt(10);
            arr.add(value);
        }
        System.out.printf("Начальный список %s\n", arr);
        int i = 0;
        while (i < arr.size()) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf("Список, в котором удалены четные числа %s", arr);
    }

}
