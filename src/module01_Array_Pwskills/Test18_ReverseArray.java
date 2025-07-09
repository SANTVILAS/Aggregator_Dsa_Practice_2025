package module01_Array_Pwskills;

import java.util.Arrays;

public class Test18_ReverseArray {

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] =temp;
    }

    public static void main(String[] args) {
;
        int arr[] = {10,20,30,40,50};


        int i=0;
        int j=arr.length-1;
        while(i<j){
           swap(arr,i,j);
           i++;
           j--;
        }

        for(int elem:arr) {
            System.out.print(elem+" ");
        }
    }
}
