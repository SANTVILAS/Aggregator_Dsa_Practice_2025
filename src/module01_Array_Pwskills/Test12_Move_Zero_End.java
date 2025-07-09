package module01_Array_Pwskills;

import java.util.Arrays;

public class Test12_Move_Zero_End {
    public static void main(String[] args) {

        int arr[] = { 3, 0, 2, 5, 0, 0, 3 };
        pushZeroToTheEnd1(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void pushZeroToTheEnd1(int[] arr) {
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }

        }

        while(count<arr.length){
            arr[count] =0;
            count++;
        }

    }


    private static void pushZeroToTheEnd(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){

          if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
          }
        }

        while(count<arr.length){
            arr[count]=0;
            count++;
        }



    }
}
