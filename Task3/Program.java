package Task3;

import java.util.ArrayList;

import java.util.Collections;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(3);
        arr.add(10);
        arr.add(6);
        arr.add(22);
        arr.add(23);

        ArrayList<Integer> nums = arr;
        int result = 0;
        for (int m : nums) {
            result += m;

        }
        int average = result / arr.size();
        System.out.printf(" Минимальный элемент: %s \n ", Collections.min(arr));
        System.out.printf("Среднее арифметическое: %s \n", average);
        System.out.printf(" Максимальный элемент: %s \n", Collections.max(arr));

    }

}