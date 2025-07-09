package module02_2D_Array;

import java.util.Arrays;

public class Test05_Sort_2D_Array {
    public static void main(String[] args) {

        int[][] intervals = { {1, 3}, {8, 10},{2, 6}, {15, 18} };
        Arrays.sort(intervals,(a,b)->a[0] -b[0]);

        for(int pair[] :intervals){

            System.out.println("[" + pair[0]+" ,"+pair[1]+"]");
        }
    }
}
