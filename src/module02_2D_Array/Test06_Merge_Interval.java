package module02_2D_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Need to revisit


public class Test06_Merge_Interval {

    public static int[][] mergeAlternative(int[][] intervals) {
        Arrays.sort(intervals,(a, b)->a[0] -b[0]);

        // i need to add red in list
        List<int[]> res = new ArrayList<>();
        int[] current = intervals[0];

        // I need to iterate in whole array

        for(int i=0;i<intervals.length;i++){
            int[] next = intervals[i];

            // check if interval overlap
            if(current[1]>=next[0]){
                // Merge intervals
                current[1]= Math.max(current[1],next[1]);
            }else {
                res.add(current);
                current=next;  // this is very imp line
            }

        }
        //add last interval
        res.add(current);
        return res.toArray(new int[res.size()][]);
    }

    public static void printIntervals(int[][] intervals) {
        System.out.print("[");
        for (int i = 0; i < intervals.length; i++) {
            System.out.print("[" + intervals[i][0] + "," + intervals[i][1] + "]");
            if (i < intervals.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {


        // Test case 1: [[1,3],[2,6],[8,10],[15,18]
        int[][] intervals1 = {{1,3}, {2,6}, {8,10}, {15,18}};
        System.out.println("Input: ");
        printIntervals(intervals1);
        System.out.println("Output: ");
        printIntervals(mergeAlternative(intervals1));

        System.out.println();

    }
}
