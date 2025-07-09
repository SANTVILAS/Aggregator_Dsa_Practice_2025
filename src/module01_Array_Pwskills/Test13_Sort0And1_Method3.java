package module01_Array_Pwskills;

import java.util.Arrays;

public class Test13_Sort0And1_Method3 {

    public static void sort_Zero_Using_Colour_Sort(int[] arr) {

        int count_Number_Zeros = 0;
        int count_Number_ones = 0;
        int count_Number_twos = 0;

        // Count occurrences of 0s, 1s, and 2s
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count_Number_Zeros++;
            } else if (arr[i] == 1) {
                count_Number_ones++;
            } else {
                count_Number_twos++;
            }
        }

        // Fill the array with sorted values
        int index = 0;

        for (int i = 0; i < count_Number_Zeros; i++) {
            arr[index++] = 0;
        }

        for (int i = 0; i < count_Number_ones; i++) {
            arr[index++] = 1;
        }

        for (int i = 0; i < count_Number_twos; i++) {
            arr[index++] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 2, 2, 1, 0, 2, 0, 0, 1, 1, 0, 1, 1, 0, 0, 2, 2, 2};
        sort_Zero_Using_Colour_Sort(arr);
    }
}
