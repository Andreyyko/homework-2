package homework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //task 1


        System.out.println("Task #1: \nBecause Java allocates a fixed memory cell to an array ");


        //task 2


        System.out.println("Task #2: \nArray sorted by DESC");
        int[] array = {2, 3, 1, 7, 11};
        int n = array.length;
        int temp = 0;
        System.out.println("Unsorted array:   " + Arrays.toString(array));
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] < array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sorted array:   " + Arrays.toString(array));


        //task 3


        System.out.println("Task #3: ");
        int[] nums = {50, -24, 42, 22, -90, -1, 3};
        System.out.println(Arrays.toString(nums));
        int sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        System.out.println("Sum:  " + sum);


        //task 4


        System.out.println("Task #4:  \nOur array");
        int[] array2 = {3, 1, 5, 8, 2, 9, 12};
        System.out.println(Arrays.toString(array2));
        int avg = 0;
        for (int i = 0; i < array2.length; i++) {
            avg += array2[i];
        }
        int arithMean = avg /= array2.length;
        System.out.println("Arithmetic mean:  " + arithMean);


        //task 5


        System.out.println("Task #5:  \nOur array");
        int[] array3 = {3, 2, 3, 1, 4, 2, 8, 3};
        System.out.println(Arrays.toString(array3));
        for (int i = 0; i < array3.length; i++) {
            for (int j = i + 1; j < array3.length; j++) {
                if (array3[i] == array3[j]) {
                    array3[j] = 0;
                }
            }
        }
        System.out.println("Result:  " + Arrays.toString(array3));
    }
}