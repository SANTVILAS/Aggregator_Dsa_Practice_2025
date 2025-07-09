package module02_2D_Array;

public class Test04_Iterate_Over_2d_Array {

    public static void main(String[] args) {

        int[][] intervals = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
        System.out.println(intervals.length);

        for(int i=0;i<intervals.length;i++){

            int[] pair=intervals[i];
            System.out.println("intercal "+(i + 1)+ ": [" +pair[0]+" "+pair[1]+"]");
        }


        //alternate approach


        // alternate way to iterate over array

        System.out.println("===================");

        for(int pair[] :intervals){

            System.out.println("[" + pair[0]+" ,"+pair[1]+"]");
        }


        System.out.println("========================");


        for(int[] pair:intervals){
            for(int elem:pair){

                System.out.println(elem);
                System.out.println();

            }

        }



    }



}
