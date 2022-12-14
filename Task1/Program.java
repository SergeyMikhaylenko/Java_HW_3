package Task1;

import java.util.Arrays;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        int[] arr = { 2, -20, 33, 2, -5, -100, 5, 98, 22, 100 };
        int[] result = mergesort(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergesort(int[] arr) {
        int[] bufferOne = Arrays.copyOf(arr, arr.length);
        int[] bufferTwo = new int[arr.length];
        int[] result = mergesortInner(bufferOne, bufferTwo, 0, arr.length);
        return result;
    }

    public static int[] mergesortInner(int[] bufferOne, int[] bufferTwo,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return bufferOne;
        }

        int mid = startIndex + (endIndex - startIndex) / 2;
        int[] sortedFirst = mergesortInner(bufferOne, bufferTwo, startIndex, mid);
        int[] sortedSecond = mergesortInner(bufferOne, bufferTwo, mid, endIndex);

        int indexOne = startIndex;
        int indexTwo = mid;
        int destIndex = startIndex;
        int[] result = sortedFirst == bufferOne ? bufferTwo : bufferOne;
        while (indexOne < mid && indexTwo < endIndex) {
            result[destIndex++] = sortedFirst[indexOne] < sortedSecond[indexTwo]
                    ? sortedFirst[indexOne++]
                    : sortedSecond[indexTwo++];
        }
        while (indexOne < mid) {
            result[destIndex++] = sortedFirst[indexOne++];
        }
        while (indexTwo < endIndex) {
            result[destIndex++] = sortedSecond[indexTwo++];
        }
        return result;
    }
}